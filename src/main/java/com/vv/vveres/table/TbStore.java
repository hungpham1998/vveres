package com.vv.vveres.table;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TbStore")
@Data
public class TbStore {
    @Id
    @Column(name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private  String title;

    @Column(name = "code")
    private  String code;

    @Column(name = "note")
    private  String note;

    @Column(name = "restaurantId")
    private long restaurantId;
}
