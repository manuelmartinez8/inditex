package com.indra.adapter.rest;

import com.indra.adapter.request.BrandRequest;
import com.indra.domain.repository.BrandRepository;
import com.indra.domain.service.BrandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class BrandController {


        @Autowired
        private BrandRepository repository;

        @Autowired
        private BrandServiceImpl imple;



    @PostMapping("/brand")
    public ResponseEntity<BrandRequest> saveBrand(@RequestBody BrandRequest brandRequest){
        try {
            imple.saveBrand(brandRequest);
            return new ResponseEntity<BrandRequest>(HttpStatus.CREATED);
        }
        catch (Exception e){}
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
