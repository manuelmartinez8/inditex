package com.indra.domain.repository;

import com.indra.domain.model.PricesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PricesRepository  extends JpaRepository<PricesEntity, Integer> {



    @Query(value = "SELECT * FROM prices where product_id=?1", nativeQuery = true)
    public List<PricesEntity> findPricesByProductId(int productid);


}
