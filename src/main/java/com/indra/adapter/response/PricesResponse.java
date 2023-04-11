package com.indra.adapter.response;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PricesResponse {

    /*: identificador de producto,
     identificador de cadena, tarifa a aplicar,
      fechas de aplicación y precio final a aplicar.*/
    private int productId;
    private int brandId;
    private BigDecimal pricefinal;
    private LocalDateTime dateApplication;
    private String rate;


}
