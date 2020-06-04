package com.vv.vveres.table;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbTimesheets")
@Data


public class TbTimesheets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    long idStaffment;
    float numberDate;
    float overtime;
    Date month;
    Date year;
}
