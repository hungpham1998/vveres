package com.vv.vveres.table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.swing.*;
import java.util.Date;
import java.util.Set;

// author: vutrananh98hn@gmail.com
// edit author: hungrost@gmail.com
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tbCustomer")


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

    @Column(name="debtmoney", nullable = false, unique = false,length = 20)
    private double debtmoney;

    @Column(name="note", nullable = false, unique = false,length = 150)
    private String note;


    @Column(name="restaurantId", nullable = false, unique = false,length = 10)
    private long restaurantId;

//    @ManyToOne
//    @JoinColumn(name = "customergroupid", nullable = false)
//    @JsonIgnoreProperties("customer")
//    private TbCustomerGroup customerGroup;

    // @JsonBackReference
    @JsonIgnore
    @OneToMany(mappedBy = "tbCustomer", fetch = FetchType.LAZY)
    //@JsonIgnoreProperties("tbCustomer")
    private Set<TbExportInvoice> tbExportInvoice;

}
