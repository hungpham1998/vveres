package com.vv.vveres.dto;

import javax.persistence.*;

import com.vv.vveres.table.TbRestaurant;
import com.vv.vveres.table.TbUnit;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DTOProduct {
    private Long id;

    private  String title;

    private  String code;

    private  String universalProCode;

    private  String note;

    private boolean isFinishedProduct;

    private  boolean isRawMaterial;

    private  String image;

    private  long unitId;

    private  long restaurantId;

    private  long groupProductId;

    private List<TbUnit> units = new ArrayList<>();
    //    private Set<TbRestaurant> restaurants = new HashSet<>();
}
