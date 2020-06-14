package com.vv.vveres.table;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

//author: phamthecong@gmail.com
@Data
@Entity
@Table(name = "TbProduct")
public class TbProduct {
    @Id
    @Column(length = 10, name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, name = "title")
    private  String title;

    @Column(length = 10, name = "code")
    private  String code;

    @Column(length = 10, name = "universalProCode")// mã giảm giá
    private  String universalProCode;

    @Column(length = 150, name = "note")
    private  String note;

    @Column(length = 10,name = "isFinishedProduct")
    private boolean isFinishedProduct;

    @Column(length = 10,name = "isRawMaterial")
    private  boolean isRawMaterial;

    @Column(length = 50, name = "image")
    private  String image;

    @Column(length = 10,name = "unitId")
    private  long unitId;

    @Column(length = 10,name = "restaurantId")
    private  long restaurantId;

    @Column(length = 10,name = "groupProductId")
    private  long groupProductId;



}
