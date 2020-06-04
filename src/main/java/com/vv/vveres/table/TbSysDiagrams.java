package com.vv.vveres.table;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbSysDiagrams")
@Data

public class TbSysDiagrams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    int principal_id;
    int diagramId;
    int version;
    String definition;
}
