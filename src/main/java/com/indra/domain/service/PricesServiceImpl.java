package com.indra.domain.service;

import com.indra.adapter.request.PricesReq;
import com.indra.adapter.response.PricesResponse;
import com.indra.domain.model.PricesEntity;
import com.indra.domain.repository.PricesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("pricesService")
public class PricesServiceImpl implements IPricesService {

    @Autowired
    private PricesRepository repository;

    @Override
    public List<PricesEntity> getPricesList(PricesReq request) {
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

    @Override
    public List<PricesResponse> getPrice(PricesReq request) {
        List<PricesEntity> prices = new ArrayList<>();
        List<PricesResponse> pricesValidate = new ArrayList<>();
        prices = repository.findPricesByProductId(request.getProduct_id());
        prices.forEach(prices1 -> {
            if (comparateDate(prices1,request)){
                pricesValidate.add(getResponse(prices1));
            }
        });

        return pricesValidate;
    }
//METODO QUE DETERMINA LA FECHA DE APLICACION DE LA OFERTA
    public boolean  comparateDate(PricesEntity prices,PricesReq request){
        boolean answer = false;

        if(request.getApplication_date().isAfter(prices.getStart_date()) && request.getApplication_date().isBefore(prices.getEnd_date()) && request.getBrand_id() == prices.getBrand().getBrand_id()){
            answer = true;
        }
        return answer;
    }
    /*
    * Esta funcion recibe un objeto de tipo entity y lo convierte en response
    * */
    private PricesResponse getResponse(PricesEntity entity){
        PricesResponse response=new PricesResponse();
        response.setProductId(entity.getProduct_id());
        response.setBrandId(entity.getBrand().getBrand_id());
        response.setPricefinal(entity.getPrices());
        response.setDateApplication(entity.getStart_date());
        response.setRate(entity.getPrice_list());

        return response;
    }
}
