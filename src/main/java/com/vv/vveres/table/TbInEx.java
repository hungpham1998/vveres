package com.vv.vveres.table;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TbInEx")

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


    @ManyToOne
    @JoinColumn(name = "restaurantid", nullable = false)
    @JsonIgnoreProperties("restaurantInEx")
    private TbRestaurant inexRestaurant;

}
