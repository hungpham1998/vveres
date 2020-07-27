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
@Table(name = "tbUnit")

public class TbUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name="title" ,nullable=false, unique=false, length = 10)
    private String title;


    @Column(name="description" ,nullable=false, unique=false, length = 10)
    private String description;

    @Column(name="unitSymbol" ,nullable=false, unique=false, length = 10)
    private String unitSymbol;

    Long idRestaurant;

    //@JsonBackReference
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "units")
    @JsonIgnore
    //@JsonIgnoreProperties({"units"})
    private Set<TbProduct> products = new HashSet<>();

//    @JsonBackReference
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tbUnit")
    private Set<TbExportDetail> tbExportDetails;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "preparationUnit")
//    @JsonIgnoreProperties("preparationUnit")
//    private Set<TbPreparation> unitPreparation = new HashSet<>();
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "preparationDetailUnit")
//    @JsonIgnoreProperties("preparationDetailUnit")
//    private Set<TbPreparationDetail> unitPreparationDetail = new HashSet<>();

//
//    @ManyToOne(fetch = FetchType.LAZY, mappedBy = "invertoryUnit")
//    @JsonIgnoreProperties("invertoryUnit")
//    private Set<TbInvertory> unitInvertory = new HashSet<>();
}
