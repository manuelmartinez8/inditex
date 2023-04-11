package com.indra.domain.service;

import com.indra.adapter.request.PricesReq;
import com.indra.adapter.response.PricesResponse;
import com.indra.domain.model.PricesEntity;

import java.util.List;

public interface IPricesService {

    public List<PricesEntity> getPricesList(PricesReq request);
    public List<PricesResponse> getPrice(PricesReq request);
}
