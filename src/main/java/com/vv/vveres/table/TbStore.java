package com.vv.vveres.table;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
//author: phamthecong@gmail.com
@Entity
@Table(name = "TbStore")
@Data
public class TbStore {
    @Id
    @Column(length = 10,name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50,name = "title")
    private  String title;

    @Column(length = 10,name = "code")
    private  String code;

    @Column(length = 150,name = "note")
    private  String note;

    @Column(length = 10,name = "restaurantId")
    private long restaurantId;
}

