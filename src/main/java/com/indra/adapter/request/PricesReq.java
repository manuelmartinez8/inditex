package com.indra.adapter.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class PricesReq {

    /*
    * CAMPOS USADOS PARA REALIZAR LA CONSULTA
    * */
    private int brand_id;
    private int product_id;
    private LocalDateTime application_date;
}
