package com.indra.adapter.rest;


import com.indra.adapter.request.PricesReq;
import com.indra.adapter.response.PricesResponse;
import com.indra.domain.model.PricesEntity;
import com.indra.domain.service.PricesServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/v1", produces = "application/json")
public class PricesController {


    @Autowired
    private PricesServiceImpl impl;


//ENDPOINT USADO PARA OBTENER LA OFERTA REQUERIDA
    @GetMapping("/price")
    public ResponseEntity<List<PricesResponse>> getPrice(@RequestBody PricesReq request){
        return new ResponseEntity<>(impl.getPrice(request), HttpStatus.OK);
    }


    @GetMapping("/prices")
    public ResponseEntity<List<PricesEntity>> getPrices(@RequestBody PricesReq request){
        return new ResponseEntity<>(impl.getPricesList(request), HttpStatus.OK);
    }




}
