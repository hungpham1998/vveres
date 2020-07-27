package com.vv.vveres.table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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


//    @OneToMany
//    @JsonIgnoreProperties("customerGroup")
//    private Set<TbCustomer> customer = new HashSet<>();

}
