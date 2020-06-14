package com.vv.vveres.table;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

// author: vutrananh98hn@gmail.com
@Entity
@Table(name="tbExportInvoice")
@Data

public class TbExportInvoice {
    @Id
    @Column(name="id", nullable = false, unique= false,length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="code", nullable = false, unique = false,length = 10)
    private String code;

    @Basic(optional = false)
    @Column(name = "invoiceDate", insertable = false, updatable = false,nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    Date invoiceDate;

    @Column(name="invoiceName", nullable = false, unique = false,length = 50)
    private String invoiceName;

    @Column(name="payment", nullable = false, unique = false,length = 10)
    private double payment ;

    @Column(name="deposit", nullable = false, unique = false,length = 10)
    private double deposit ;

    @Column(name="debt", nullable = false, unique = false,length = 10)
    private double debt ;

    @Column(name="total", nullable = false, unique = false,length = 10)
    private double total ;

    @Column(name="typeImExProductId", nullable = false, unique = false,length = 10)
    private long typeImExProductId;

    @Column(name="restaurantId", nullable = false, unique = false,length = 10)
    private long restaurantId;
}
