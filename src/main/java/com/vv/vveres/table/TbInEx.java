package com.vv.vveres.table;


import javax.persistence.*;

@Entity
@Table(name = "TbInEx")
public class TbInEx {

    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "inEx")
    private String inEx;

    @Column(name = "title")
    private String title;

    @Column(name = "note")
    private String note;

    @Column(name = "restaurantId")
    private long restaurantId;

}

