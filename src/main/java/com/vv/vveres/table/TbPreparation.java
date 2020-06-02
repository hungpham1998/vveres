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

    @Column(name = "uniId")
    private long unitId;

    @Column(name = "productNum")
    private double productNum;

    @Column(name = "restaurantId")
    private long restaurantId;


    @Column(name = "status")
    private boolean status;


    public Long getId() {
        return Id;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public double getProductNum() {
        return productNum;
    }

    public long getProductId() {
        return productId;
    }

    public long getUnitId() {
        return unitId;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setProductNum(double productNum) {
        this.productNum = productNum;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
