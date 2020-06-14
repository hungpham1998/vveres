package com.vv.vveres.table;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
//author: phamthecong@gmail.com
@Data
@Entity
@Table(name = "TbRestaurant")
public class TbRestaurant {
    @Id
    @Column(length = 10, name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, name = "title")
    private  String title;

    @Column(length = 50,name = "address")
    private  String address;

    @Column(length = 150,name = "note")
    private  String note;

    @Column(length = 50,name = "website")
    private  String website;

    @Column(length = 15,name = "phoneNumber")
    private  String phoneNumber;

    @Column(length = 20,name = "mail")
    private  String mail;


}

