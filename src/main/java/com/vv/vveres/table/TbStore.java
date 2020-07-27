package com.vv.vveres.table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "TbStore")

public class TbStore {
    @Id
    @Column(length = 10,name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50,name = "title")
    private  String title;

    @Column(length = 10,name = "code")
    private  String code;

    @Column(length = 150,name = "note")
    private  String note;

    @Column(length = 10,name = "restaurantId")
    private long restaurantId;

//
//    @ManyToOne(fetch = FetchType.LAZY, mappedBy = "exportStore")
//    @JsonIgnoreProperties("exportStore")
//    private Set<TbInvertory> storeInvertory = new HashSet<>();

//    @JsonBackReference
    @JsonIgnore
    @OneToMany(mappedBy = "tbStore", fetch = FetchType.LAZY)
   // @JsonIgnoreProperties("tbStore")
    private Set<TbExportInvoice> tbExportInvoice;


    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tbStore")
    private Set<TbImportInvoice>  tbImportInvoice;
}

