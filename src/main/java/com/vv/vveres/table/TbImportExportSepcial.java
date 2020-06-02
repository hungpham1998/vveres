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

    public Long getId() {
        return Id;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public long getExportId() {
        return exportId;
    }

    public long getImportId() {
        return importId;
    }

    public long getTypeIEproduct() {
        return typeIEproduct;
    }


    public void setId(Long id) {
        Id = id;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setExportId(long exportId) {
        this.exportId = exportId;
    }

    public void setImportId(long importId) {
        this.importId = importId;
    }

    public void setTypeIEproduct(long typeIEproduct) {
        this.typeIEproduct = typeIEproduct;
    }
}
