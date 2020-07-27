package com.vv.vveres.dto;

// author: tranducdang@gmail.com

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DTOOrderDetail {

    private Long id;

    Date invoicedate;

    private int number;

    private double payment ;

    private double discount_per ;

    private double discount_mo ;

    private double total ;

    private Long restaurantId;

    private Long tbProductId;

    private String tbProductTitle;

}
