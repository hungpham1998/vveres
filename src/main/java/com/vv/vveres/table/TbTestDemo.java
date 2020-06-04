package com.vv.vveres.table;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="TbTestDemo")
@Data


public class TbTestDemo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
}
