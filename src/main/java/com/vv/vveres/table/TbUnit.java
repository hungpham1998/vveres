package com.vv.vveres.table;

import lombok.Data;

import javax.persistence.*;
@Entity
@Table(name = "tbUnit")
@Data

public class TbUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String description;
    String unitSymbol;
    long idRestaurant;
}
