package com.vv.vveres.dto;

import java.util.Date;

import com.vv.vveres.table.TbImportInvoice;
import com.vv.vveres.table.TbProduct;
import com.vv.vveres.table.TbUnit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// author: hungrost@gmail.com
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DTOExportDetail {

    private Long id;

    Date expirydate;

    private double exportprice;

    private double exportnum;

    private double freenum;

    private double discountper;

    private double discountmo;

    private double discountmo1;

    private double total;
    
    private Long tbProductId;

    private String tbProductTitle;

    private Long tbUnitId;

    private String tbUnitTitle;

    private  Long tbImportInvoiceId;

    private  String tbImportInvoiceName;

    private TbProduct tbProduct;

    private TbUnit tbUnit;

    private TbImportInvoice tbImportInvoice;

}
