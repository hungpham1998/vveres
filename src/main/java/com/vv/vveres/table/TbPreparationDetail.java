package com.vv.vveres.table;


import javax.persistence.*;

@Entity
@Table(name = "TbPreparationDetail")
public class TbPreparationDetail {

    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "productId")
    private long productId;

    @Column(name = "preparationId")
    private long preparationId;

    @Column(name = "unitId")
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

    public long getProductId() {
        return productId;
    }

    public double getProductNum() {
        return productNum;
    }

    public long getUnitId() {
        return unitId;
    }

    public long getRestaurantId() {
        return restaurantId;
    }


    public long getPreparationId() {
        return preparationId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setProductNum(double productNum) {
        this.productNum = productNum;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setPreparationId(long preparationId) {
        this.preparationId = preparationId;
    }
}
