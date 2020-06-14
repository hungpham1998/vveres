package com.vv.vveres.dto;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class DTOProduct {

    private long id;

    private  String title;

    private  String code;

    private  String universalProCode;

    private  String note;

    private boolean isFinishedProduct;

    private  boolean isRawMaterial;

    private  String image;

    private  long unitId;

    private String titleUnit;

    private  long restaurantId;

    private String titleRestaurant;

    private  long groupProductId;

    private String titleGroupProduct;
}
