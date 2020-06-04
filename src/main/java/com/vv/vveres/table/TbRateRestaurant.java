package com.vv.vveres.table;


import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "TbRateRestaurant")
public class TbRateRestaurant {
    @Id
    @Column(name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "rateSpace")
    private  int rateSpace;

    @Column(name = "rateFood")
    private  int rateFood;

    @Column(name = "rateService")
    private  int rateService;

    @Column(name = "ratePrice")
    private  int ratePrice;

    @Column(name = "rateImage")
    private  String rateImage;

    @Column(name = "rateQuality")
    private  int rateQuality;

    @Column(name = "restaurantId")
    private long restaurantId;

    @Column(name = "customerId")
    private long customerId;


    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }
    public void setRateSpace(int rateSpace) {
        this.rateSpace = rateSpace;
    }
    public int getRateSpace() {
        return rateSpace;
    }
    public void setRateFood(int rateFood) {
        this.rateFood = rateFood;
    }
    public int getRateFood() {
        return rateFood;
    }
    public void setRateService(int rateService) {
        this.rateService = rateService;
    }
    public int getRateService() {
        return rateService;
    }
    public void setRatePrice(int ratePrice) {
        this.ratePrice = ratePrice;
    }
    public int getRatePrice() {
        return ratePrice;
    }
    public void setRateImage(String rateImage) {
        this.rateImage = rateImage;
    }
    public String getRateImage() {
        return rateImage;
    }
    public void setRateQuality(int rateQuality) {
        this.rateQuality = rateQuality;
    }
    public int getRateQuality() {
        return rateQuality;
    }
    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }
    public long getRestaurantId() {
        return restaurantId;
    }
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
    public long getCustomerId() {
        return customerId;
    }



}
