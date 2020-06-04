package com.vv.vveres.table;

import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name = "TbProduct")
public class TbProduct {
    @Id
    @Column(name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private  String title;

    @Column(name = "code")
    private  String code;

    @Column(name = "universalProCode")// mã giảm giá
    private  String universalProCode;

    @Column(name = "note")
    private  String note;

    @Column(name = "isFinishedProduct")
    private boolean isFinishedProduct;

    @Column(name = "isRawMaterial")
    private  boolean isRawMaterial;

    @Column(name = "image")
    private  String image;

    @Column(name = "unitId")
    private  long unitId;

    @Column(name = "restaurantId")
    private  long restaurantId;

    @Column(name = "groupProductId")
    private  long groupProductId;


    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }

    public void setUniversalProCode(String universalProCode) {
        this.universalProCode = universalProCode;
    }
    public String getUniversalProCode() {
        return universalProCode;
    }

    public void setNote(String note) {
        this.note = note;
    }
    public String getNote() {
        return note;
    }

    public void setIsFinishedProduct(boolean isFinishedProduct) {
        this.isFinishedProduct = isFinishedProduct;
    }
    public boolean getIsFinishedProduct() {
        return isFinishedProduct;
    }

    public void setIsRawMaterial (boolean isRawMaterial) {
        this.isRawMaterial = isRawMaterial;
    }
    public boolean getIsRawMaterial() {
        return isRawMaterial;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public String getImage() {
        return image;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }
    public long getUnitId() {
        return unitId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }
    public long getRestaurantId() {
        return restaurantId;
    }

    public void setGroupProductId(long groupProductId) {
        this.groupProductId = groupProductId;
    }
    public long getGroupProductId() {
        return groupProductId;
    }




}