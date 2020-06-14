package com.vv.vveres.table;


import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "TbInEx")
@Data
// Authen: Hungrost@gamil.com
public class TbInEx {

    @Id
    @Column(name = "id",nullable=false, unique=false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "inEx",nullable=false, unique=false, length = 10)
    private String inEx;

    @Column(name = "title",nullable=false, unique=false, length = 10)
    private String title;

    @Column(name = "note",nullable=false, unique=false, length = 10)
    private String note;

    @Column(name = "restaurantId",nullable=false, unique=false, length = 10)
    private long restaurantId;


}
