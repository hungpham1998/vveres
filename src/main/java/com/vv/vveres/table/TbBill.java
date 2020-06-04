package com.vv.vveres.table;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="TbBill")
@Data

public class TbBill
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    Long id_ordertable;
    Date create_Date;
    Long status;
    Long discount;
    Long totalmoney;
    Long id_customer;
    String description;
    Long id_staffment;
    Long id_restaurant;
}
