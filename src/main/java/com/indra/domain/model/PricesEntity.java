package com.indra.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "prices")
@AllArgsConstructor
@NoArgsConstructor
public class PricesEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pricesid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="brand_id")
    private BrandEntity brand;

    private int product_id;
    private String priority;
    private LocalDateTime start_date;
    private BigDecimal prices;
    private LocalDateTime  end_date;
    private String curr;
    private String price_list;

    public PricesEntity(int brand_id,LocalDateTime start_date, LocalDateTime end_date,  int product_id, String priority,  BigDecimal prices,  String curr, String price_list) {


        this.product_id = product_id;
        this.priority = priority;
        this.start_date = start_date;
        this.prices = prices;
        this.end_date = end_date;
        this.curr = curr;
        this.price_list = price_list;
    }
}
