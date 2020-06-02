package com.vv.vveres.table;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "TbImportInvoice")
public class TbImportInvoice {

    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "code")
    private String code;

    @Column(name="invoiceDate")
    private Date invoiceDate;

    @Column(name="invoiceName")
    private String invoiceName;

    @Column(name="payment")
    private double payMent;

    @Column(name="deposit")
    private double deposit;

    @Column(name="debt")
    private double debt;

    @Column(name="total")
    private double total;

    @Column(name="typeImExProductId")
    private long typeImExProductId;

    @Column(name="storeId")
    private long storeId;

    @Column(name="staffmentId")
    private long staffmentId;

    @Column(name="suppilerId")
    private long suppilerId;


    public void setTotal(double total) {
        this.total = total;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public void setPayMent(double payMent) {
        this.payMent = payMent;
    }

    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    public void setStaffmentId(long staffmentId) {
        this.staffmentId = staffmentId;
    }

    public void setSuppilerId(long suppilerId) {
        this.suppilerId = suppilerId;
    }

    public void setTypeImExProductId(long typeImExProductId) {
        this.typeImExProductId = typeImExProductId;
    }

    public double getTotal() {
        return total;
    }


    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public double getDebt() {
        return debt;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getPayMent() {
        return payMent;
    }

    public long getStoreId() {
        return storeId;
    }

    public long getStaffmentId() {
        return staffmentId;
    }

    public long getSuppilerId() {
        return suppilerId;
    }

    public long getTypeImExProductId() {
        return typeImExProductId;
    }

    public String getCode() {
        return code;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
