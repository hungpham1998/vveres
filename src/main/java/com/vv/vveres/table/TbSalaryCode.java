package com.vv.vveres.table;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


//author: phamthecong@gmail.com
@Data
@Entity
@Table(name = "TbSalaryCode")
public class TbSalaryCode {
    @Id
    @Column(length = 10,name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20,name = "salary")
    private  int salary;

    @Basic(optional = false)
    @Column(name = "month", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    Date month;


    @Column(length = 10,name = "departmentId")
    private  long departmentId;


    @Column(length = 10,name = "restaurantId")
    private  long restaurantId;


}



