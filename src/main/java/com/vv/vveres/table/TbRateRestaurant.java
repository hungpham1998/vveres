package com.vv.vveres.table;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

//author: phamthecong@gmail.com
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TbRateRestaurant")
public class TbRateRestaurant {
    @Id
    @Column(length = 10, name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10,name = "rateSpace")
    private  int rateSpace;

    @Column(length = 10,name = "rateFood")
    private  int rateFood;

    @Column(length = 10,name = "rateService")
    private  int rateService;

    @Column(length = 10,name = "ratePrice")
    private  int ratePrice;

    @Column(length = 10,name = "rateImage")
    private  String rateImage;

    @Column(length = 10,name = "rateQuality")
    private  int rateQuality;

    @Column(length = 10,name = "restaurantId")
    private long restaurantId;

    @Column(length = 10,name = "customerId")
    private long customerId;




}

