package com.vv.vveres.table;


import javax.persistence.*;

@Entity
@Table(name = "TbPreparation")
public class TbPreparation {

    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "product_Id")
    private long product_Id;

    @Column(name = "unit_Id")
    private long unit_Id;

    @Column(name = "productNum")
    private double product_Num;

    @Column(name = "restaurant_Id")
    private long restaurant_Id;


    @Column(name = "status")
    private boolean status;


    public Long getId() {
        return Id;
    }

    public long getRestaurant_Id() {
        return restaurant_Id;
    }

    public long getProduct_Id() {
        return product_Id;
    }

    public long getUnit_Id() {
        return unit_Id;
    }

    public double getProduct_Num() {
        return product_Num;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setRestaurant_Id(long restaurant_Id) {
        this.restaurant_Id = restaurant_Id;
    }

    public void setProduct_Id(long product_Id) {
        this.product_Id = product_Id;
    }

    public void setUnit_Id(long unit_Id) {
        this.unit_Id = unit_Id;
    }

    public void setProduct_Num(double product_Num) {
        this.product_Num = product_Num;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
