package com.vv.vveres.table;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

// author: vutrananh98hn@gmail.com
@Entity
@Table(name="tbDiscountProduct")
@Data
public class TbDiscountProduct
{
    @Id
    @Column(name="id", nullable = false, unique= false,length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="note", nullable = false, unique = false,length = 150)
    private String note;

    @Basic(optional = false)
    @Column(name = "startDate", insertable = false, updatable = false,nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    Date startDate;

    @Basic(optional = false)
    @Column(name = "duaDate", insertable = false, updatable = false,nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    Date duaDate;

    @Column(name="price", nullable = false, unique = false,length = 10)
    private double price;

    @Column(name="productId", nullable = false, unique = false,length = 10)
    private long productId;

    @Column(name="storeId", nullable = false, unique = false,length = 10)
    private long storeId;

    @Column(name="restaurantId", nullable = false, unique = false,length = 10)
    private long restaurantId;


}

