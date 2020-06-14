package com.vv.vveres.table;


import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "TbPreparation")
@Data
// Authen: Hungrost@gamil.com
public class TbPreparation {

    @Id
    @Column(name = "id",nullable=false, unique=false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "productId",nullable=false, unique=false, length = 10)
    private long productId;

    @Column(name = "unitId",nullable=false, unique=false, length = 10)
    private long unitId;

    @Column(name = "productNum",nullable=false, unique=false, length = 10)
    private double productNum;

    @Column(name = "restaurantId",nullable=false, unique=false, length = 10)
    private long restaurantId;


    @Column(name = "status")
    private boolean status;


}
