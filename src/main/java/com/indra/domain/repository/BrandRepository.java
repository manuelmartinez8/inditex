package com.indra.domain.repository;

import com.indra.domain.model.BrandEntity;
import com.indra.domain.model.PricesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Integer> {
}
