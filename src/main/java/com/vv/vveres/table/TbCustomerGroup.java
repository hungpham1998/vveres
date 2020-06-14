package com.vv.vveres.table;

import lombok.Data;

import javax.persistence.*;

// author: vutrananh98hn@gmail.com

@Entity
@Table(name = "tbCustomerGroup")
@Data
public class TbCustomerGroup {
    @Id
    @Column(name="id", nullable = false, unique= false,length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title", nullable = false, unique = false,length = 50)
    private String title;


    @Column(name="note", nullable = false, unique = false,length = 150)
    private String note;

    @Column(name="parentId", nullable = false, unique = false,length = 10)
    private long parentId;

    @Column(name="restaurantId", nullable = false, unique = false,length = 10)
    private long restaurantId;

}
