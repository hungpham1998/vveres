package com.vv.vveres.table;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

// author: vutrananh98hn@gmail.com
@Entity
@Table(name = "tbCustomer")
@Data

public class TbCustomer {
    @Id
    @Column(name="id", nullable = false, unique= false,length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title", nullable = false, unique = false,length = 50)
    private String title;

    @Column(name="address", nullable = false, unique = false,length = 50)
    private String address;

    @Column(name="phone", nullable = false, unique = false,length = 15)
    private String phone;

    @Column(name="image", nullable = false, unique = false,length = 10)
    private String image;

    @Basic(optional = false)
    @Column(name = "birthday", insertable = false, updatable = false,nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    Date birthday;

    @Column(name="fax", nullable = false, unique = false,length = 15)
    private String fax;

    @Column(name="debtMoney", nullable = false, unique = false,length = 20)
    private double debtMoney;

    @Column(name="note", nullable = false, unique = false,length = 150)
    private String note;

    @Column(name="customergroupId", nullable = false, unique = false,length = 10)
    private long customergroupId;

    @Column(name="restaurantId", nullable = false, unique = false,length = 10)
    private long restaurantId;

}
