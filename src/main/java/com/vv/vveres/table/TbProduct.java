package com.vv.vveres.table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


//author: tranducdang@gmail.com
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
    private  Long unitId;

    @Column(length = 10,name = "restaurantId")
    private  Long restaurantId;

    @Column(length = 10,name = "groupProductId")
    private  Long groupProductId;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })

    // Relationship
    //@JsonManagedReference
    @JoinTable(name = "product_unit",
            joinColumns = @JoinColumn(
                    name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "unit_id", referencedColumnName = "id"))
    @JsonIgnore
    //@JsonIgnoreProperties({"products"})
    private Set<TbUnit> units = new HashSet<>();

    //-- TbProduct 1-n TbOrderDetail
    //@JsonBackReference
    //@JsonIgnoreProperties("tbOrderDetail")
    @OneToMany(mappedBy = "tbProduct", fetch = FetchType.LAZY)
    private Set<TbOrderDetail> tbOrderDetail;


//    @JsonBackReference
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tbProduct")
    private Set<TbExportDetail> tbExportDetails;


//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "importDetailProduct")
//    @JsonIgnoreProperties("importDetailProduct")
//    private Set<TbImportDetail> productImportDetail = new HashSet<>();
//
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "preparationDetailProduct")
//    @JsonIgnoreProperties("preparationDetailProduct")
//    private Set<TbPreparationDetail> productPreparationDetail = new HashSet<>();
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "preparationProduct")
//    @JsonIgnoreProperties("preparationProduct")
//    private Set<TbPreparation> productPreparation = new HashSet<>();

}
