package com.vv.vveres.table;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TbImportExportSepcial")
@Data
// Authen: Hungrost@gamil.com
public class TbImportExportSepcial {
    @Id
    @Column(name = "id",nullable=false, unique=false,length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    @Column(name = "importId",nullable=false, unique=false, length = 10)
    private long  importId;

    @Column(name = "exportId",nullable=false, unique=false, length = 10)
    private long  exportId;

    @Column(name = "typeIEproduct",nullable=false, unique=false, length = 10)
    private long  typeIEproduct;

    @Column(name = "restaurantId",nullable=false, unique=false, length = 10)
    private long  restaurantId;


}
