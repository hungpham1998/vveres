package com.vv.vveres.table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

// author: tranducdang@gmail.com
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tbOrder")
public class TbOrder {

    @Id
    @Column(name="id", nullable = false, unique= false,length = 25)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="code", nullable = false, unique = false,length = 15)
    private String code;

    @Basic(optional = false)
    @Column(name = "invoicedate", insertable = false, updatable = false,nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    Date invoicedate;

    @Column(name="invoicename", nullable = false, unique = false,length = 50)
    private String invoicename;

    @Column(name="payment", nullable = false, unique = false,length = 25)
    private double payment ;

    @Column(name="deposit", nullable = false, unique = false,length = 25)
    private double deposit ;

    @Column(name="debt", nullable = false, unique = false,length = 25)
    private double debt ;

    @Column(name="total", nullable = false, unique = false,length = 25)
    private double total ;

//    @Column(name="restaurantId", nullable = false, unique = false,length = 50)
//    private long restaurantId;

    // Relationship
    //@JsonManagedReference   // JsonManagedReference xác định bảng chính (kết nối trái - kết nối phải) & JsonBackReference xác định bảng phụ. Tạo cấu trúc Json theo 2 chiều
    @OneToMany(mappedBy = "tbOrder", fetch = FetchType.LAZY) // 1 bản ghi Order có nhiều bản ghi Order detail. Lưu ý: fetch = FetchType.EAGER
    //@JsonIgnoreProperties("orderDetails") // Không muốn hiển thị List của Entity nào thì khai báo ở đây
    private Set<TbOrderDetail> tbOrderDetail;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private TbRestaurant tbRestaurant;
}
