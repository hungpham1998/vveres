package com.vv.vveres.table;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TbLossProduct")
public class TbLossProduct {
    @javax.persistence.Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "lossNum")
    private double lossNum;

    @Column(name = "importprice")
    private double importPrice;

    @Column(name = "lossDate")
    private Date lossDate;

    @Column(name="Note")
    private  String Note;

    @Column(name="product_Id")
    private  long product_Id;

    @Column(name="unit_Id")
    private  long unit_Id;

    @Column(name="restaurant_Id")
    private  long restaurant_Id;

    public void setUnit_Id(long unit_Id) {
        this.unit_Id = unit_Id;
    }

    public void setProduct_Id(long product_Id) {
        this.product_Id = product_Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setRestaurant_Id(long restaurant_Id) {
        this.restaurant_Id = restaurant_Id;
    }

    public void setNote(String note) {
        Note = note;
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

    public long getUnit_Id() {
        return unit_Id;
    }

    public long getProduct_Id() {
        return product_Id;
    }

    public Long getId() {
        return Id;
    }

    public long getRestaurant_Id() {
        return restaurant_Id;
    }

    public String getNote() {
        return Note;
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
}
