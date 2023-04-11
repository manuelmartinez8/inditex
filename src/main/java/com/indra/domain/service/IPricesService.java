package com.indra.domain.service;

import com.indra.adapter.request.PricesRequest;
import com.indra.domain.model.PricesEntity;

import java.util.List;
import java.util.Optional;

public interface IPricesService {

    public List<PricesEntity> getPricesList(PricesRequest request);
}
