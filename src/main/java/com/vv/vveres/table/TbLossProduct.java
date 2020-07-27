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
@Table(name = "TbLossProduct")


// Authen: Hungrost@gamil.com
public class TbLossProduct {
    @Id
    @Column(name = "id",nullable=false, unique=false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "lossnum",nullable=false, unique=false, length = 10)
    private double lossnum;

    @Column(name = "importprice",nullable=false, unique=false, length = 10)
    private double importprice;
    
    @Basic(optional = false)
    @Column(name = "lossdate", insertable = false, updatable = false, length =  10)
    @Temporal(TemporalType.TIMESTAMP)
    Date lossdate;

    @Column(name="note")
    private  String note;


    @Column(name="restaurantid",nullable=false, unique=false, length = 10)
    private  long restaurantid;

    @Column(name="status")
    private  boolean status;

//
//    @ManyToOne
//    @JoinColumn(name = "productid", nullable = false)
//    @JsonIgnoreProperties("lossProduct")
//    private TbProduct product;
//
//
//    @ManyToOne
//    @JoinColumn(name = "unitid", nullable = false)
//    @JsonIgnoreProperties("lossProductUnit")
//    private TbUnit unitLossProduct;
//
}
