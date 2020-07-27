package com.vv.vveres.table;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TbImportDetail")

// Authen: Hungrost@gamil.com
public class TbImportDetail {

    @Id
    @Column(name = "id",nullable=false, unique=false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(name = "active", length = 10)
    private boolean active;

    @Column(name = "debtmoney" ,nullable=false, unique=false, length = 10)
    private double debtmoney;

    @Column(name = "discountmo",nullable=false, unique=false, length = 10)
    private double discountmo;

    @Column(name = "discountmo1",nullable=false, unique=false, length = 10)
    private double discountmo1;

    @Column(name = "discountper",nullable=false, unique=false, length = 10)
    private double discountper;

    @Column(name = "freenum",nullable=false, unique=false, length = 10)
    private double freenum;

    @Column(name = "importnum",nullable=false, unique=false, length = 10)
    private double importnum;

    @Column(name = "importprice",nullable=false, unique=false, length = 10)
    private double importprice;

    @Column(name = "total",nullable=false, unique=false, length = 10)
    private double total;

    @Column(name = "note",nullable=false, unique=false, length = 10)
    private String note;

    @Basic(optional = false)
    @Column(name = "expirydate", insertable = false, updatable = false, length = 10)
    @Temporal(TemporalType.TIMESTAMP)
    Date expirydate;


//    @ManyToOne
//    @JoinColumn(name = "unitid", nullable = false)
//    @JsonIgnoreProperties("unitImportDetail")
//    private TbUnit importDetailUnit;


    @ManyToOne
    @JoinColumn(name = "restaurantid", nullable = false)
   // @JsonIgnoreProperties("restaurantImportDetail")
    private TbRestaurant importDetailRestaurant;

    @ManyToOne
    @JoinColumn(name = "invoicedid", nullable = false)
   // @JsonIgnoreProperties("importInvoiceDetail")
    private TbImportInvoice importDetailInvoice;


    @ManyToOne
    @JoinColumn(name = "productid", nullable = false)
  //  @JsonIgnoreProperties("productImportDetail")
    private TbProduct importDetailProduct;



}
