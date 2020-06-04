package com.vv.vveres.table;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TbLossProduct")
public class TbLossProduct {
    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "lossNum")
    private double lossNum;

    @Column(name = "importprice")
    private double importPrice;

    @Column(name = "lossDate")
    private Date lossDate;

    @Column(name="note")
    private  String note;

    @Column(name="productId")
    private  long productId;

    @Column(name="unitId")
    private  long unitId;

    @Column(name="restaurantId")
    private  long restaurantId;

    @Column(name="status")
    private  boolean status;


}
