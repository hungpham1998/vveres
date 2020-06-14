package com.vv.vveres.table;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

// author: vutrananh98hn@gmail.com
@Entity
@Table(name="tbExportDetail")
@Data

public class TbExportDetail {
    @Id
    @Column(name="id", nullable = false, unique= false,length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="importinvoiceId", nullable = false, unique = false,length = 10)
    private long importinvoiceId;

    @Column(name="productId", nullable = false, unique = false,length = 10)
    private long productId;

    @Basic(optional = false)
    @Column(name = "expiryDate", insertable = false, updatable = false,nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    Date expiryDate;

    @Column(name="exportPrice", nullable = false, unique = false,length = 10)
    private double exportPrice;

    @Column(name="exportNum", nullable = false, unique = false,length = 10)
    private double exportNum;

    @Column(name="freeNum", nullable = false, unique = false,length = 10)
    private double freeNum;

    @Column(name="unitId", nullable = false, unique = false,length = 10)
    private long unitId;

    @Column(name="discountPer", nullable = false, unique = false,length = 10)
    private double discountPer ;

    @Column(name="discountMo", nullable = false, unique = false,length = 10)
    private double discountmo ;

    @Column(name="discountMo1", nullable = false, unique = false,length = 10)
    private double discountmo1;

    @Column(name="total", nullable = false, unique = false,length = 10)
    private double total ;

    @Column(name="customerId", nullable = false, unique = false,length = 10)
    private long customerId;

    @Column(name="storeId", nullable = false, unique = false,length = 10)
    private long storeId;


    @Column(name="staffmentId", nullable = false, unique = false,length = 10)
    private long staffmentId;

    @Column(name="restaurantId", nullable = false, unique = false,length = 10)
    private long restaurantId;
}
