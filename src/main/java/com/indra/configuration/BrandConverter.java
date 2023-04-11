package com.indra.configuration;

import com.indra.adapter.request.BrandRequest;
import com.indra.domain.model.BrandEntity;
import org.modelmapper.ModelMapper;

public class BrandConverter {

    static ModelMapper model = new ModelMapper();

    public static BrandEntity brandRequestToEntity(BrandRequest request){
        return model.map(request, BrandEntity.class);
    }


    public static BrandRequest brandEntityToRequest(BrandEntity request){
        return model.map(request, BrandRequest.class);
    }

}
