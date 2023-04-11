package com.indra.configuration;

import com.indra.adapter.request.PricesDTO;
import com.indra.domain.model.PricesEntity;
import org.modelmapper.ModelMapper;

public class PricesConverter {

     static ModelMapper model = new ModelMapper();

    public static PricesEntity priceRequestToEntity(PricesDTO request){
        return model.map(request, PricesEntity.class);
    }

    public static PricesDTO priceEntityToRequest(PricesEntity request){
        return model.map(request, PricesDTO.class);
    }




}
