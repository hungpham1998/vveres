package com.vv.vveres.table;



import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TbInvertory")
// Authen: Hungrost@gamil.com
public class TbInvertory {

    @Id
    @Column(name = "id",nullable=false, unique=false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Basic(optional = false)
    @Column(name = "expiryDate", insertable = false, updatable = false, length =  10)
    @Temporal(TemporalType.TIMESTAMP)
    Date expiryDate;

    @Column(name = "productNum",nullable=false, unique=false, length = 10)
    private double productNum;

    @Column(name = "note",nullable=false, unique=false, length = 10)
    private String note;


    @Column(name = "importinvoiceId",nullable=false, unique=false, length = 10)
    private long importinvoiceId;

    @Column(name = "restaurantId",nullable=false, unique=false, length = 10)
    private long restaurantId;


    @Column(name = "status")
    private boolean status;

//    @ManyToOne
//    @JoinColumn(name = "storeid", nullable = false)
//    @JsonIgnoreProperties("storeInvertory")
//    private TbStore invertoryStore;


//    @ManyToOne
//    @JoinColumn(name = "productid", nullable = false)
//    @JsonIgnoreProperties("productInvertory")
//    private TbProduct invertoryProduct;

//
//    @ManyToOne
//    @JoinColumn(name = "unitid", nullable = false)
//    @JsonIgnoreProperties("unitInvertory")
//    private TbUnit invertoryUnit;

}
