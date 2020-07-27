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
@Table(name = "TbStaffment")

public class TbStaffment {
    @Id
    @Column(length = 10,name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50,name = "title")
    private String title ;

    @Column(length = 20,name = "idcard")
    private String idcard ;

    @Column(length = 50,name = "address")
    private String address ;

    @Column(length = 50,name = "phone")
    private String phone ;

    @Column(length = 50,name = "mail")
    private String mail;

    @Column(length = 150,name = "note")
    private String note;

    @Basic(optional = false)
    @Column(name = "startday", insertable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startday;


    @Basic(optional = false)
    @Column(name = "birthday", insertable = true , updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthday;

    @Column(length = 20,name = "password")
    private String password ;

    @Column(length = 20,name = "identityCard")
    private String identityCard ;

    @Column(length = 10,name = "departmentId")
    private long departmentId ;

    @Column(length = 10,name = "restaurantId")
    private long restaurantId;


//    @JsonBackReference
    @JsonIgnore
    @OneToMany(mappedBy = "tbStaffment", fetch = FetchType.EAGER)
    //@JsonIgnoreProperties("tbStaffment")
    private Set<TbExportInvoice> ir = new HashSet<>();


//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "importStaffment")
//    @JsonIgnoreProperties("importStaffment")
//    private Set<TbImportInvoice> staffmentImport = new HashSet<>();

}

