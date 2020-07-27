package com.vv.vveres.table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbSupplier")
@Data

public class TbSupplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name="code" ,nullable=false, unique=false, length = 10)
    private String code;

    @Column(name="title" ,nullable=false, unique=false, length = 10)
    private String title;

    @Column(name="address" ,nullable=false, unique=false, length = 10)
    private String address;

    @Column(name="phone" ,nullable=false, unique=false, length = 10)
    private String phone;

    @Column(name="homePhone" ,nullable=false, unique=false, length = 10)
    private String homePhone;

    @Column(name="pername" ,nullable=false, unique=false, length = 10)
    private String pername;

    @Column(name="fax" ,nullable=false, unique=false, length = 10)
    private String fax;

    @Column(name="taxcode" ,nullable=false, unique=false, length = 10)
    private String taxcode;

    @Column(name="note" ,nullable=false, unique=false, length = 10)
    private String note;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tbSupplier")
    private Set<TbImportInvoice> tbImportInvoice;

}
