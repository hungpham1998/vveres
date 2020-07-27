package com.vv.vveres.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.vv.vveres.table.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.Store;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
// author: hungrost@gmail.com

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DTOExportInvoice {

    private Long id;

    private String code;

    private Date invoicedate;

    private String invoicename;

    private double payment;

    private double deposit;

    private double debt ;

    private double total ;

    private long restaurant_id;

    private String tbCustomerTitle;

    private String tbStoreTitle;

    private String tbStaffmentTitle;

    private String tbTypeImexProductTitle;

    private TbCustomer tbCustomer;

    private TbStore tbStore;

    private TbStaffment tbStaffment;

    private TbTypeImexProduct tbTypeImexProduct;

    private List<DTOExportDetail> dtoExportDetails = new ArrayList<>();
}
