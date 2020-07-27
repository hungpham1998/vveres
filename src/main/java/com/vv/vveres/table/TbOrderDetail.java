package com.vv.vveres.table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
// author: tranducdang@gmail.com
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tbOrderDetail")
public class TbOrderDetail {
    @Id
    @Column(name="id", nullable = false, unique= false,length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    @Column(name = "invoicedate", insertable = false, updatable = false,nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    Date invoicedate;

    @Column(name="number", nullable = false, unique = false,length = 15)
    private int number ;

    @Column(name="payment", nullable = false, unique = false,length = 15)
    private double payment ;

    @Column(name="discount_per", nullable = false, unique = false,length = 15)
    private double discount_per ;

    @Column(name="discount_mo", nullable = false, unique = false,length = 15)
    private double discount_mo ;

    @Column(name="total", nullable = true, unique = false,length = 15)
    private double total ;


    @Column(name="restaurantId", nullable = false, unique = false,length = 15)
    private long restaurantId;

    // Relationship

    // TbOrder 1-n TbOrderDetail
    //@JsonBackReference
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false) // thông qua khóa ngoại orderId, nhiều bản ghi Order Detail chỉ liên kết duy nhất 1 bản ghi Order
    //@JsonIgnoreProperties("orderDetails")
    private TbOrder tbOrder;

    // TbProduct 1-n TbOrderDetail
    //@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private TbProduct tbProduct;


    // LƯU Ý: Không được phép khai báo thêm OrderID trong Entity OrderDetail. Bởi lẽ khi join 2 Entity này với nhau,
    // Spring Boot đã ngầm định được orderID mang những đặc tính, các thuộc tính cụ thể của trường id (id trong Entity Order)

}
