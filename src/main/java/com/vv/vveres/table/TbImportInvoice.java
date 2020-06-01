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

    @Column(name="typeImExProduct_Id")
    private long typeImExProduct_Id;

    @Column(name="store_Id")
    private long store_Id;

    @Column(name="staffment_Id")
    private long staffment_Id;

    @Column(name="suppiler_Id")
    private long suppiler_Id;


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

    public void setStaffment_Id(long staffment_Id) {
        this.staffment_Id = staffment_Id;
    }

    public void setStore_Id(long store_Id) {
        this.store_Id = store_Id;
    }

    public void setSuppiler_Id(long suppiler_Id) {
        this.suppiler_Id = suppiler_Id;
    }

    public void setTypeImExProduct_Id(long typeImExProduct_Id) {
        this.typeImExProduct_Id = typeImExProduct_Id;
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

    public long getStaffment_Id() {
        return staffment_Id;
    }

    public long getStore_Id() {
        return store_Id;
    }

    public long getSuppiler_Id() {
        return suppiler_Id;
    }

    public long getTypeImExProduct_Id() {
        return typeImExProduct_Id;
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
