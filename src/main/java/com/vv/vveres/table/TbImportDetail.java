package com.vv.vveres.table;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "TbImportDetail")
//@Data
public class TbImportDetail {

    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long Id;

    @Column(name = "active", nullable=false, unique=false)
    private boolean active;

    @Column(name = "debtMoney")
    private double debtMoney;

    @Column(name = "discountMo")
    private double discountMo;

    @Column(name = "discountMo1")
    private double discountMo1;

    @Column(name = "discountPer")
    private double discountPer;

    @Column(name = "freeNum")
    private double freeNum;

    @Column(name = "importNum")
    private double importNum;

    @Column(name = "importPrice")
    private double importPrice;

    @Column(name = "total")
    private double total;

    @Column(name = "note")
    private String note;

    @Column(name = "expiryDate")
    private Date expiryDate;

    @Column(name = "unitId")
    private long unitId;

    @Column(name = "restaurantId")
    private long restaurantId;

    @Column(name = "invoicedId")
    private long invoiceId;

    @Column(name = "productId")
    private long productId;

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setId(long id) {
        this.Id = id;
    }

    public void setDebtMoney(double debtMoney) {
        this.debtMoney = debtMoney;
    }

    public void setDiscountMo(double discountMo) {
        this.discountMo = discountMo;
    }

    public void setDiscountMo1(double discountMo1) {
        this.discountMo1 = discountMo1;
    }

    public void setDiscountPer(double discountPer) {
        this.discountPer = discountPer;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setImportNum(double importNum) {
        this.importNum = importNum;
    }

    public void setFreeNum(double freeNum) {
        this.freeNum = freeNum;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public long getId() {
        return Id;
    }

    public double getTotal() {
        return total;
    }

    public String getNote() {
        return note;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public double getDebtMoney() {
        return debtMoney;
    }

    public double getDiscountMo() {
        return discountMo;
    }

    public double getDiscountMo1() {
        return discountMo1;
    }

    public double getDiscountPer() {
        return discountPer;
    }

    public double getFreeNum() {
        return freeNum;
    }

    public double getImportNum() {
        return importNum;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public long getInvoiceId() {
        return invoiceId;
    }

    public long getProductId() {
        return productId;
    }

    public long getUnitId() {
        return unitId;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

}
