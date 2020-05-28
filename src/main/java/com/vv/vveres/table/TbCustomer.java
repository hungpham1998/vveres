package com.vv.vveres.table;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbCustomer")
@Data
public class TbCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String address;
    String phone;
    String image;
    long birthday;
    String fax;
    long debtmoney;
    String note;
    Long idcustomergroup;
    Long idrestaurant;
}
