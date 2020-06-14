package com.vv.vveres.table;



import javax.persistence.*;

import lombok.Data;

import java.util.Date;


@Entity
@Table(name = "TbInvertory")
@Data
// Authen: Hungrost@gamil.com
public class TbInvertory {

    @Id
    @Column(name = "id",nullable=false, unique=false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Basic(optional = false)
    @Column(name = "expiryDate", insertable = false, updatable = false, length =  10)
    @Temporal(TemporalType.TIMESTAMP)
    Date expiryDate;

    @Column(name = "productNum",nullable=false, unique=false, length = 10)
    private double productNum;

    @Column(name = "note",nullable=false, unique=false, length = 10)
    private String note;

    @Column(name = "unitId",nullable=false, unique=false, length = 10)
    private long unitId;

    @Column(name = "productId",nullable=false, unique=false, length = 10)
    private long productId;

    @Column(name = "importinvoiceId",nullable=false, unique=false, length = 10)
    private long importinvoiceId;

    @Column(name = "restaurantId",nullable=false, unique=false, length = 10)
    private long restaurantId;

    @Column(name = "storeId",nullable=false, unique=false, length = 10)
    private long storeId;

    @Column(name = "status")
    private boolean status;


}
