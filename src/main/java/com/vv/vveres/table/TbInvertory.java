package com.vv.vveres.table;



import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "TbInvertory")
public class TbInvertory {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "expiryDate")
    private Date expiryDate;

    @Column(name = "productNum")
    private double productNum;

    @Column(name = "note")
    private String note;

    @Column(name = "unitId")
    private long unitId;

    @Column(name = "productId")
    private long productId;

    @Column(name = "importinvoiceId")
    private long importinvoiceId;

    @Column(name = "restaurantId")
    private long restaurantId;

    @Column(name = "storeId")
    private long storeId;


    @Column(name = "status")
    private boolean status;

    public void setNote(String note) {
        note = note;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setImportinvoiceId(long importinvoiceId) {
        this.importinvoiceId = importinvoiceId;
    }


    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setProductNum(double productNum) {
        this.productNum = productNum;
    }

    public String getNote() {
        return note;
    }

    public Long getId() {
        return Id;
    }

    public Date getExpiryDate() {
        return expiryDate;
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

    public long getImportinvoiceId() {
        return importinvoiceId;
    }

    public long getStoreId() {
        return storeId;
    }

    public long getProductId() {
        return productId;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

}
