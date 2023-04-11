package com.indra.adapter.request;

import com.indra.domain.model.BrandEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PricesRequest  implements Serializable {


    public PricesRequest(int brand_id, LocalDateTime start_date, LocalDateTime end_date, String price_list, int product_id, String priority, BigDecimal prices, String curr) {
        this.brand_id = brand_id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.price_list = price_list;
        this.product_id = product_id;
        this.priority = priority;
        this.prices = prices;
        this.curr = curr;
    }



    private int brand_id;
    private LocalDateTime start_date;
    private LocalDateTime  end_date;
    private String price_list;
    private int product_id;
    private String priority;
    private BigDecimal prices;
    private String curr;
    private int pricesid;
    private LocalDateTime application_date;

}
