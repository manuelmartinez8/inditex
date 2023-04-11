package com.indra.domain.service;

import com.indra.adapter.request.BrandRequest;
import com.indra.configuration.BrandConverter;

import com.indra.domain.repository.BrandRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("brandService")
@NoArgsConstructor
public class BrandServiceImpl implements IBrandService {

    @Autowired
    private BrandRepository repository;

    @Override
    public void saveBrand(BrandRequest brand) {
        try{
            repository.save(BrandConverter.brandRequestToEntity(brand));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

//    public BrandRepositoryImpl(BrandRepository repository) {
//        this.repository = repository;
//    }

//    public ResponseEntity<BrandRequest> saveBrand(BrandRequest brand){
//    try {
//        repository.save(new BrandEntity(brand.getBrand_id(), brand.getBrandname()));
//        return new ResponseEntity<BrandRequest>(HttpStatus.CREATED);
//    }catch (Exception e){
//        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//    }


}
