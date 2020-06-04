package com.vv.vveres.table;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "TbImportInvoice")
public class TbImportInvoice {

    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "code")
    private String code;

    @Column(name="invoiceDate")
    private Date invoiceDate;

    @Column(name="invoiceName")
    private String invoiceName;

    @Column(name="payment")
    private double payMent;

    @Column(name="deposit")
    private double deposit;

    @Column(name="debt")
    private double debt;

    @Column(name="total")
    private double total;

    @Column(name="typeImExProductId")
    private long typeImExProductId;

    @Column(name="storeId")
    private long storeId;

    @Column(name="staffmentId")
    private long staffmentId;

    @Column(name="suppilerId")
    private long suppilerId;


}
