package com.indra.adapter.response;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PricesResponse {

    /*: identificador de producto,
     identificador de cadena, tarifa a aplicar,
      fechas de aplicación y precio final a aplicar.*/
    private String productId;
    private String brandId;
    private BigDecimal rate;
    private LocalDateTime dateApplication;
    private BigDecimal finalPrices;


}
