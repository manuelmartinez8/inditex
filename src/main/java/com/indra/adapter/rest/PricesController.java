package com.indra.adapter.rest;


import com.indra.adapter.request.PricesRequest;
import com.indra.domain.model.PricesEntity;
import com.indra.domain.repository.PricesRepository;
import com.indra.domain.service.PricesServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/v1", produces = "application/json")
public class PricesController {


    @Autowired
    private PricesServiceImpl impl;

    @GetMapping("/prices")
    public ResponseEntity<List<PricesEntity>> getPrices(@RequestBody PricesRequest request){
        return new ResponseEntity<>(impl.getPricesList(request), HttpStatus.OK);
    }


}
