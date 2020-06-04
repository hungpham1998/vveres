package com.vv.vveres.table;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbTypeImexFinance")
@Data

public class  TbTypeImexFinance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String code;
    String title;
    long idRestaurant;
}
