package com.vv.vveres.table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

// author: vutrananh98hn@gmail.com
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tbExportDetail")

public class TbExportDetail {
    @Id
    @Column(name="id", nullable = false, unique= false,length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Basic(optional = false)
    @Column(name = "expirydate", insertable = false, updatable = false,nullable = false, unique = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expirydate;

    @Column(name="exportprice", nullable = false, unique = false,length = 20)
    private double exportprice;

    @Column(name="exportnum", nullable = false, unique = false,length = 20)
    private double exportnum;

    @Column(name="freenum", nullable = false, unique = false,length = 20)
    private double freenum;


    @Column(name="discountper", nullable = false, unique = false,length = 20)
    private double discountper ;

    @Column(name="discountmo", nullable = false, unique = false,length = 20)
    private double discountmo ;

    @Column(name="discountmo1", nullable = false, unique = false,length = 20)
    private double discountmo1;

    @Column(name="total", nullable = false, unique = false,length = 20)
    private double total ;


//    @JsonBackReference
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "export_invoice_id", nullable = false)
    private TbExportInvoice tbExportInvoice;

//    @JsonManagedReference
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "unit_id", nullable = false)
    private TbUnit tbUnit;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private TbProduct tbProduct;


//    @JsonManagedReference
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "import_invoice_id", nullable = false)
    private TbImportInvoice tbImportInvoice;
}
