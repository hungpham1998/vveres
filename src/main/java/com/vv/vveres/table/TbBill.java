package com.vv.vveres.table;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

// author: vutrananh98hn@gmail.com
@Entity
@Table(name="tbBill")
@Data
public class TbBill
{
    @Id
    @Column(name="id", nullable = false, unique= false,length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name="title", nullable = false, unique = false, length = 50)
    private String title;
    @Size

    @Column(name="ordertableId", nullable = false, unique = false,length = 10)
    private long ordertableId;

    @Basic(optional = false)
    @Column(name = "createDate", insertable = false, updatable = false,nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    Date createDate;

    @Column(name="status", nullable = false, unique = false,length = 5)
    private boolean status;

    @Column(name="discount", nullable = false, unique = false,length = 10)
    private long discount;

    @Column(name="totalMoney", nullable = false, unique = false,length = 20)
    private long totalMoney;

    @Column(name="customerId", nullable = false, unique = false,length = 10)
    private long customerId;

    @Column(name="description", nullable = false, unique = false,length = 50)
    private String description;

    @Column(name="staffmentId", nullable = false, unique = false,length = 10)
    private long staffmentId;

    @Column(name="restaurantId", nullable = false, unique = false,length = 10)
    private long restaurantId;


}

