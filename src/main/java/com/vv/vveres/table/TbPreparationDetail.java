package com.vv.vveres.table;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TbPreparationDetail")

// Authen: Hungrost@gamil.com
public class TbPreparationDetail {

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
    @JsonIgnoreProperties("restaurantPreparationDetail")
    private TbRestaurant perparationDetailRestaurant;


    @ManyToOne
    @JoinColumn(name = "productid", nullable = false)
    @JsonIgnoreProperties("productPreparationDetail")
    private TbProduct preparationDetailProduct;


    @ManyToOne
    @JoinColumn(name = "preparationid", nullable = false)
    @JsonIgnoreProperties("preparationDetail")
    private TbPreparation preparation;


//    @ManyToOne
//    @JoinColumn(name = "unitid", nullable = false)
//    @JsonIgnoreProperties("unitPreparationDetail")
//    private TbUnit preparationDetailUnit;

}
