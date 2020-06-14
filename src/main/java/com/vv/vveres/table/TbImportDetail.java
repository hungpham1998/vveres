package com.vv.vveres.table;

import javax.persistence.*;

import lombok.Data;

import java.util.Date;


@Entity
@Table(name = "TbImportDetail")
@Data
// Authen: Hungrost@gamil.com
public class TbImportDetail {

    @Id
    @Column(name = "id",nullable=false, unique=false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(name = "active", length = 10)
    private boolean active;

    @Column(name = "debtMoney" ,nullable=false, unique=false, length = 10)
    private double debtMoney;

    @Column(name = "discountMo",nullable=false, unique=false, length = 10)
    private double discountMo;

    @Column(name = "discountMo1",nullable=false, unique=false, length = 10)
    private double discountMo1;

    @Column(name = "discountPer",nullable=false, unique=false, length = 10)
    private double discountPer;

    @Column(name = "freeNum",nullable=false, unique=false, length = 10)
    private double freeNum;

    @Column(name = "importNum",nullable=false, unique=false, length = 10)
    private double importNum;

    @Column(name = "importPrice",nullable=false, unique=false, length = 10)
    private double importPrice;

    @Column(name = "total",nullable=false, unique=false, length = 10)
    private double total;

    @Column(name = "note",nullable=false, unique=false, length = 10)
    private String note;

    @Basic(optional = false)
    @Column(name = "expiryDate", insertable = false, updatable = false, length = 10)
    @Temporal(TemporalType.TIMESTAMP)
    Date expiryDate;

    @Column(name = "unitId",nullable=false, unique=false, length = 10)
    private long unitId;

    @Column(name = "restaurantId",nullable=false, unique=false, length = 10)
    private long restaurantId;

    @Column(name = "invoicedId",nullable=false, unique=false, length = 10)
    private long invoiceId;

    @Column(name = "productId",nullable=false, unique=false, length = 10)
    private long productId;

}
