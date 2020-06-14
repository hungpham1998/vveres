package com.vv.vveres.table;
import lombok.Data;

import javax.persistence.*;

// author: vutrananh98hn@gmail.com
@Entity
@Table(name = "tbGroupProduct")
@Data

public class TbGroupProduct {
    @Id
    @Column(name="id", nullable = false, unique= false,length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="parentId", nullable = false, unique = false,length = 10)
    private long parentId;

    @Column(name="code", nullable = false, unique = false,length = 20)
    private String code;

    @Column(name="title", nullable = false, unique = false,length = 50)
    private String title;

    @Column(name="restaurantId", nullable = false, unique = false,length = 10)
    private long restaurantId;
}
