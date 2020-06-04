package com.vv.vveres.table;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "TbImportDetail")
//@Data
public class TbImportDetail {

    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long Id;

    @Column(name = "active", nullable=false, unique=false)
    private boolean active;

    @Column(name = "debtMoney")
    private double debtMoney;

    @Column(name = "discountMo")
    private double discountMo;

    @Column(name = "discountMo1")
    private double discountMo1;

    @Column(name = "discountPer")
    private double discountPer;

    @Column(name = "freeNum")
    private double freeNum;

    @Column(name = "importNum")
    private double importNum;

    @Column(name = "importPrice")
    private double importPrice;

    @Column(name = "total")
    private double total;

    @Column(name = "note")
    private String note;

    @Column(name = "expiryDate")
    private Date expiryDate;

    @Column(name = "unitId")
    private long unitId;

    @Column(name = "restaurantId")
    private long restaurantId;

    @Column(name = "invoicedId")
    private long invoiceId;

    @Column(name = "productId")
    private long productId;

}
