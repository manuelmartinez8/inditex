package com.indra.configuration;

import com.indra.adapter.request.PricesRequest;
import com.indra.domain.model.PricesEntity;
import org.modelmapper.ModelMapper;

public class PricesConverter {

     static ModelMapper model = new ModelMapper();

    public static PricesEntity priceRequestToEntity(PricesRequest request){
        return model.map(request, PricesEntity.class);
    }

    public static PricesRequest priceEntityToRequest(PricesEntity request){
        return model.map(request, PricesRequest.class);
    }




}
