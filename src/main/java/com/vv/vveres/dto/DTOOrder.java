package com.vv.vveres.dto;

import com.vv.vveres.table.TbOrderDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;
// author: tranducdang@gmail.com

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DTOOrder {
    private Long id;

    private String code;

    Date invoicedate;

    private String invoicename;

    private double payment ;

    private double deposit ;

    private double debt ;

    private double total ;

    private long restaurantId;

    private List<DTOOrderDetail> dtoOrderDetails = new ArrayList<>(); // list ko có ở trong TbOrder
}
