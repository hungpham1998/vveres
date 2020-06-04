package com.vv.vveres.table;


import javax.persistence.*;

@Entity
@Table(name = "TbOrderTable")
public class TbOrderTable {
    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "title")
    private String title;

    @Column(name = "status")
    private boolean status;

    @Column(name = "note")
    private String note;

    @Column(name = "seating")
    private int seating;

    @Column(name = "restaurantId")
    private long restaurantId;

}
