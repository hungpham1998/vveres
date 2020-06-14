package com.vv.vveres.table;

import javax.persistence.*;

import lombok.Data;

import java.util.Date;


@Entity
@Table(name = "TbImportInvoice")
@Data
// Authen: Hungrost@gamil.com
public class TbImportInvoice {

    @Id
    @Column(name = "id",nullable=false, unique=false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name = "code" ,nullable=false, unique=false, length = 10)
    private String code;


    @Basic(optional = false)
    @Column(name = "invoiceDate", insertable = false, updatable = false, length =  10)
    @Temporal(TemporalType.TIMESTAMP)
    Date invoiceDate;

    @Column(name="invoiceName" ,nullable=false, unique=false, length = 10)
    private String invoiceName;

    @Column(name="payment",nullable=false, unique=false, length = 10)
    private double payMent;

    @Column(name="deposit",nullable=false, unique=false, length = 10)
    private double deposit;

    @Column(name="debt",nullable=false, unique=false, length = 10)
    private double debt;

    @Column(name="total",nullable=false, unique=false, length = 10)
    private double total;

    @Column(name="typeImExProductId",nullable=false, unique=false, length = 10)
    private long typeImExProductId;

    @Column(name="storeId",nullable=false, unique=false, length = 10)
    private long storeId;

    @Column(name="staffmentId",nullable=false, unique=false, length = 10)
    private long staffmentId;

    @Column(name="suppilerId",nullable=false, unique=false, length = 10)
    private long suppilerId;


}
