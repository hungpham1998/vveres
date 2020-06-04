package com.vv.vveres.table;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbTypeImexProduct")
@Data


public class TbTypeImexProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String code;
    String title;
    long IdRestauranr;
}
