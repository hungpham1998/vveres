package com.vv.vveres.table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;

import javax.persistence.*;


import java.text.SimpleDateFormat;
import java.util.*;
//import java.sql.Date;
import java.sql.Timestamp;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;

// author: vutrananh98hn@gmail.com
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tbExportInvoice")

public class TbExportInvoice {
    @Id
    @Column(name="id", nullable = false, unique= false,length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="code", nullable = false, unique = false,length = 20)
    private String code;

    @Basic(optional = false)
    @Column(name = "invoicedate", insertable = false, updatable = false, unique = false,
            columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private  Date invoicedate;


    @Column(name="invoicename", nullable = false, unique = false,length = 50)
    private String invoicename;

    @Column(name="payment", nullable = false, unique = false,length = 20)
    private double payment ;

    @Column(name="deposit", nullable = false, unique = false,length = 20)
    private double deposit ;

    @Column(name="debt", nullable = false, unique = false,length = 20)
    private double debt ;

    @Column(name="total", nullable = false, unique = false,length = 20)
    private double total ;


    @Column(name="restaurant_id", nullable = false, unique = false,length = 20)
    private long restaurant_id;

    @Column(name="status", nullable = false, unique = false,length = 20)
    private boolean status ;

//    @JsonManagedReference
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "type_im_ex_product_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnoreProperties("tbExportInvoices")
    private TbTypeImexProduct tbTypeImexProduct;



//    @JsonManagedReference
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "store_id", nullable = false)
   // @JsonIgnoreProperties("tbExportInvoice")
    private TbStore tbStore;

//    @JsonManagedReference
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tbExportInvoice")
    private Set<TbExportDetail> tbExportDetails;


//   @JsonManagedReference
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
   // @JsonIgnoreProperties("tbExportInvoice")
    private TbCustomer tbCustomer;

//    @JsonManagedReference
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "staffment_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private TbStaffment tbStaffment;

}
