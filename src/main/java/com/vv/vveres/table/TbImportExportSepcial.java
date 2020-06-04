package com.vv.vveres.table;

import javax.persistence.*;

@Entity
@Table(name = "TbImportExportSepcial")
public class TbImportExportSepcial {
    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "importId")
    private long  importId;

    @Column(name = "exportId")
    private long  exportId;

    @Column(name = "typeIEproduct")
    private long  typeIEproduct;

    @Column(name = "restaurantId")
    private long  restaurantId;

}
