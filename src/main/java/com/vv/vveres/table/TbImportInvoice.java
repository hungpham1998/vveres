package com.vv.vveres.table;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TbImportInvoice")

// Authen: Hungrost@gamil.com
public class TbImportInvoice {

    @Id
    @Column(name = "id",nullable=false, unique=false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name = "code" ,nullable=false, unique=false, length = 10)
    private String code;


    @Basic(optional = false)
    @Column(name = "invoicedate", insertable = false, updatable = false, length =  10)
    @Temporal(TemporalType.TIMESTAMP)
    Date invoicedate;

    @Column(name="invoicename" ,nullable=false, unique=false, length = 10)
    private String invoicename;

    @Column(name="payment",nullable=false, unique=false, length = 10)
    private double payment;

    @Column(name="deposit",nullable=false, unique=false, length = 10)
    private double deposit;

    @Column(name="debt",nullable=false, unique=false, length = 10)
    private double debt;

    @Column(name="total",nullable=false, unique=false, length = 10)
    private double total;

//
//    @ManyToOne
//    @JoinColumn(name = "type_im_ex_product_id", nullable = false)
//    @JsonIgnoreProperties("imexImport")
//    private TbTypeImexProduct importImEx;


//    @ManyToOne
//    @JoinColumn(name = "storeid", nullable = false)
//    @JsonIgnoreProperties("storeImport")
//    private TbStore importStore;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "storeid", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    // @JsonIgnoreProperties("tbExportInvoice")
    private TbStore tbStore;


//    @ManyToOne
//    @JoinColumn(name = "staffmentid", nullable = false)
//    @JsonIgnoreProperties("staffmentImport")
//    private TbStaffment importStaffment;


//    @ManyToOne
//    @JoinColumn(name = "suppilerid", nullable = false)
//    @JsonIgnoreProperties("supplierImportInvoice")
//    private TbSupplier importInvoiceSupplier;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "suppilerid", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    // @JsonIgnoreProperties("tbExportInvoice")
    private TbSupplier tbSupplier;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "importDetailInvoice")
    @JsonIgnoreProperties("importDetailInvoice")
    private Set<TbImportDetail> importInvoiceDetail = new HashSet<>();

//    @ManyToOne
//    @JoinColumn(name = "restaurantid", nullable = false)
//    @JsonIgnoreProperties("restaurantImportInvoice")
//    private TbRestaurant importInvoiceRestaurant;

//    @JsonBackReference
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tbImportInvoice")
    private Set<TbExportDetail> tbExportDetails;

}
