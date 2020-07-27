package com.vv.vveres.table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

//author: phamthecong@gmail.com
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TbRestaurant")
public class TbRestaurant {
    @Id
    @Column(length = 10, name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, name = "title")
    private  String title;

    @Column(length = 50,name = "address")
    private  String address;

    @Column(length = 150,name = "note")
    private  String note;

    @Column(length = 50,name = "website")
    private  String website;

    @Column(length = 15,name = "phoneNumber")
    private  String phoneNumber;

    @Column(length = 35,name = "mail")
    private  String mail;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "exportDetailRestaurant")
//    @JsonIgnoreProperties("exportDetailRestaurant")
//    private Set<TbExportDetail> restaurantExportDetail = new HashSet<>();
//

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "importDetailRestaurant")
    @JsonIgnoreProperties("importDetailRestaurant")
    private Set<TbImportDetail> restaurantImportDetail = new HashSet<>();


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orderTableRestaurant")
    @JsonIgnoreProperties("orderTableRestaurant")
    private Set<TbOrderTable> restaurantOrderTable = new HashSet<>();


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "perparationRestaurant")
    @JsonIgnoreProperties("perparationRestaurant")
    private Set<TbPreparation> restaurantPreparation = new HashSet<>();


//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "importInvoiceRestaurant")
//    @JsonIgnoreProperties("importInvoiceRestaurant")
//    private Set<TbImportInvoice> restaurantImportInvoice = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "inexRestaurant")
    @JsonIgnoreProperties("inexRestaurant")
    private Set<TbInEx> restaurantInEx = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "perparationDetailRestaurant")
    @JsonIgnoreProperties("perparationDetailRestaurant")
    private Set<TbPreparationDetail> restaurantPreparationDetail = new HashSet<>();

    // tranducdang@gmail.com

    @OneToMany(mappedBy = "tbRestaurant", fetch = FetchType.LAZY)
    private Set<TbOrder> tbOrder;
}

