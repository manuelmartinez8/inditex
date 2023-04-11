package com.indra.domain.service;

import com.indra.adapter.request.PricesRequest;
import com.indra.configuration.PricesConverter;
import com.indra.domain.model.PricesEntity;
import com.indra.domain.repository.PricesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("pricesService")
public class PricesServiceImpl implements IPricesService {

    @Autowired
    private PricesRepository repository;

    @Override
    public List<PricesEntity> getPricesList(PricesRequest request) {
        List<PricesEntity> prices = new ArrayList<>();
        List<PricesEntity> pricesValidate = new ArrayList<>();
        prices = repository.findPricesByProductId(request.getProduct_id());
        prices.forEach(prices1 -> {
            if (comparateDate(prices1,request)){
                pricesValidate.add(prices1);
            }
        });
        return pricesValidate;
    }

    public boolean  comparateDate(PricesEntity prices,PricesRequest request){
        boolean answer = false;
        if(request.getApplication_date().isAfter(prices.getStart_date()) && request.getApplication_date().isBefore(prices.getEnd_date()) && request.getBrand_id() == prices.getBrand().getBrand_id()){
            answer = true;
        }
        return answer;
    }
}
