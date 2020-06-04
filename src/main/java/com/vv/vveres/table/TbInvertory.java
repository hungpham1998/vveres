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

}
