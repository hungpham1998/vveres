package com.vv.vveres.table;



import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "TbInvertory")
public class TbInvertory {

    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "expiryDate")
    private Date expiryDate;

    @Column(name = "productNum")
    private double productNum;

    @Column(name = "Note")
    private String Note;

    @Column(name = "unit_Id")
    private long unit_Id;

    @Column(name = "product_Id")
    private long product_Id;

    @Column(name = "importinvoice_Id")
    private long importinvoice_Id;

    @Column(name = "restaurant_Id")
    private long restaurant_Id;

    @Column(name = "store_Id")
    private long store_Id;


    public void setNote(String note) {
        Note = note;
    }

    public void setRestaurant_Id(long restaurant_Id) {
        this.restaurant_Id = restaurant_Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setStore_Id(long store_Id) {
        this.store_Id = store_Id;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setImportinvoice_Id(long importinvoice_Id) {
        this.importinvoice_Id = importinvoice_Id;
    }

    public void setProduct_Id(long product_Id) {
        this.product_Id = product_Id;
    }

    public void setProductNum(double productNum) {
        this.productNum = productNum;
    }

    public void setUnit_Id(long unit_Id) {
        this.unit_Id = unit_Id;
    }

    public String getNote() {
        return Note;
    }

    public long getRestaurant_Id() {
        return restaurant_Id;
    }

    public Long getId() {
        return Id;
    }

    public long getStore_Id() {
        return store_Id;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public double getProductNum() {
        return productNum;
    }

    public long getImportinvoice_Id() {
        return importinvoice_Id;
    }

    public long getProduct_Id() {
        return product_Id;
    }

    public long getUnit_Id() {
        return unit_Id;
    }
}
