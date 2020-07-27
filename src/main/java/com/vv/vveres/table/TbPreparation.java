package com.vv.vveres.table;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TbPreparation")

// Authen: Hungrost@gamil.com
public class TbPreparation {

    @Id
    @Column(name = "id",nullable=false, unique=false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    @Column(name = "productnum",nullable=false, unique=false, length = 10)
    private double productnum;

    @Column(name = "status")
    private boolean status;


    @ManyToOne
    @JoinColumn(name = "restaurantid", nullable = false)
    // @JsonIgnoreProperties("restaurantPreparation")
    private TbRestaurant perparationRestaurant;

    @ManyToOne
    @JoinColumn(name = "productid", nullable = false)
   // @JsonIgnoreProperties("productPreparation")
    private TbProduct preparationProduct;


//    @ManyToOne
//    @JoinColumn(name = "unitid", nullable = false)
//    @JsonIgnoreProperties("unitPreparation")
//    private TbUnit preparationUnit;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "preparation")
    @JsonIgnoreProperties("preparation")
    private Set<TbPreparationDetail> preparationDetail = new HashSet<>();

}
