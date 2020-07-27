package com.vv.vveres.table;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tbTypeImexProduct")


public class TbTypeImexProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name="code" ,nullable=false, unique=false, length = 10)
    private String code;

    @Column(name="title" ,nullable=false, unique=false, length = 10)
    private String title;


//    long IdRestauranr;
//    @ManyToOne

//    @JsonBackReference
   @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tbTypeImexProduct")
   // @JsonIgnoreProperties("tbTypeImexProduct")
    private Set<TbExportInvoice> tbExportInvoices= new HashSet<>();

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "importImEx")
//    @JsonIgnoreProperties("importImEx")
//    private Set<TbImportInvoice> imexImport = new HashSet<>();
}
