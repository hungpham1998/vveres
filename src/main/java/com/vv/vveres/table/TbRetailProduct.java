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
@Table(name = "TbRetailProduct")
public class TbRetailProduct {
    @Id
    @Column(length = 10,name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20,name = "price")
    private double price;

    @Column(length = 10,name = "productId")
    private long productId;

    @Column(length = 10,name = "unitId")
    private long unitId;

    @Column(length = 10,name = "storeId")
    private long storeId;

    @Column(length = 10,name = "restaurantId")
    private long restaurantId;


}

