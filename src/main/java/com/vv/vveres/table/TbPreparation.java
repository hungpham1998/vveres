package com.vv.vveres.table;


import javax.persistence.*;

@Entity
@Table(name = "TbPreparation")
public class TbPreparation {

    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "productId")
    private long productId;

    @Column(name = "unitId")
    private long unitId;

    @Column(name = "productNum")
    private double productNum;

    @Column(name = "restaurantId")
    private long restaurantId;


    @Column(name = "status")
    private boolean status;

}
