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

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setId(Long id) {
        Id = id;
    }



    public void setNote(String note) {
        note = note;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public void setLossDate(Date lossDate) {
        this.lossDate = lossDate;
    }

    public void setLossNum(double lossNum) {
        this.lossNum = lossNum;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public long getUnitId() {
        return unitId;
    }

    public long getProductId() {
        return productId;
    }

    public Long getId() {
        return Id;
    }

    public String getNote() {
        return note;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public Date getLossDate() {
        return lossDate;
    }

    public double getLossNum() {
        return lossNum;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }
}
