package com.vv.vveres.table;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TbOrderTable")

// Authen: Hungrost@gamil.com
public class TbOrderTable {
    @Id
    @Column(name = "id",nullable=false, unique=false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "title",nullable=false, unique=false, length = 10)
    private String title;

    @Column(name = "status")
    private boolean status;

    @Column(name = "note")
    private String note;

    @Column(name = "seating",nullable=false, unique=false, length = 10)
    private int seating;

    @ManyToOne
    @JoinColumn(name = "restaurantid", nullable = false)
    // @JsonIgnoreProperties("restaurantOrderTable")
    private TbRestaurant orderTableRestaurant;


}
