package com.vv.vveres.table;

import lombok.Data;

import javax.persistence.*;

// author: vutrananh98hn@gmail.com
@Entity
@Table(name="tbDetailBill")
@Data
public class TbDetailBill
{
    @Id
    @Column(name="id", nullable = false, unique= false,length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="billId", nullable = false, unique = false,length = 10)
    private long billId;

    @Column(name="orderCount", nullable = false, unique = false,length = 10)
    private long orderCount;

    @Column(name="productId", nullable = false, unique = false,length = 10)
    private long productId;

    @Column(name="unitId", nullable = false, unique = false,length = 10)
    private long unitId;

    @Column(name="note", nullable = false, unique = false,length = 150)
    private String note;

    @Column(name="restaurantId", nullable = false, unique = false,length = 10)
    private long restaurantId;


}

