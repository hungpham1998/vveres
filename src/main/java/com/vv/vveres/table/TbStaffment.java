package com.vv.vveres.table;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


//author: phamthecong@gmail.com
@Data
@Entity
@Table(name = "TbStaffment")
public class TbStaffment {
    @Id
    @Column(length = 10,name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50,name = "title")
    private String title ;

    @Column(length = 20,name = "idCard")
    private String idCard ;

    @Column(length = 50,name = "address")
    private String address ;

    @Column(length = 15,name = "phone")
    private String phone ;

    @Column(length = 15,name = "mail")
    private String mail ;

    @Column(length = 150,name = "note")
    private String note ;

    @Basic(optional = false)
    @Column(name = "startDay", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    Date startDay;


    @Column(length = 20,name = "password")
    private String password ;

    @Column(length = 20,name = "identityCard")
    private String identityCard ;

    @Column(length = 10,name = "departmentId")
    private long departmentId ;

    @Column(length = 10,name = "restaurantId")
    private long restaurantId;


}

