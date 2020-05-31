package com.vv.vveres.table;

import javax.persistence.*;

@Entity
@Table(name = "TbImportExportSepcial")
public class TbImportExportSepcial {
    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;


    @Column(name = "Import_Id")
    private long  import_Id;

    @Column(name = "Export_Id")
    private long  export_Id;

    @Column(name = "TypeIEproduct")
    private long  typeIEproduct;

    @Column(name = "restaurant_Id")
    private long  restaurant_Id;

    public long getRestaurant_Id() {
        return restaurant_Id;
    }

    public Long getId() {
        return Id;
    }

    public long getExport_Id() {
        return export_Id;
    }

    public long getImport_Id() {
        return import_Id;
    }

    public long getTypeIEproduct() {
        return typeIEproduct;
    }

    public void setRestaurant_Id(long restaurant_Id) {
        this.restaurant_Id = restaurant_Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setExport_Id(long export_Id) {
        this.export_Id = export_Id;
    }

    public void setImport_Id(long import_Id) {
        this.import_Id = import_Id;
    }

    public void setTypeIEproduct(long typeIEproduct) {
        this.typeIEproduct = typeIEproduct;
    }
}
