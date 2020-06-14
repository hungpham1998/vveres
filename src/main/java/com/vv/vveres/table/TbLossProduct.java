package com.vv.vveres.table;


import javax.persistence.*;

import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "TbLossProduct")
@Data
// Authen: Hungrost@gamil.com
public class TbLossProduct {
    @Id
    @Column(name = "id",nullable=false, unique=false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "lossNum",nullable=false, unique=false, length = 10)
    private double lossNum;

    @Column(name = "importprice",nullable=false, unique=false, length = 10)
    private double importPrice;
    
    @Basic(optional = false)
    @Column(name = "lossDate", insertable = false, updatable = false, length =  10)
    @Temporal(TemporalType.TIMESTAMP)
    Date lossDate;

    @Column(name="note")
    private  String note;

    @Column(name="productId",nullable=false, unique=false, length = 10)
    private  long productId;

    @Column(name="unitId",nullable=false, unique=false, length = 10)
    private  long unitId;

    @Column(name="restaurantId",nullable=false, unique=false, length = 10)
    private  long restaurantId;

    @Column(name="status")
    private  boolean status;

}
