package com.vv.vveres.table;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TbRetailProduct")
public class TbRetailProduct {
    @Id
    @Column(name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "price")
    private double price;

    @Column(name = "productId")
    private long productId;

    @Column(name = "unitId")
    private long unitId;

    @Column(name = "storeId")
    private long storeId;

    @Column(name = "restaurantId")
    private long restaurantId;

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }
    public long getProductId() {
        return productId;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }
    public long getUnitId() {
        return unitId;
    }

    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }
    public long getStoreId() {
        return storeId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }
    public long getRestaurantId() {
        return restaurantId;
    }


}
