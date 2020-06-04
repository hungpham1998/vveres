package com.vv.vveres.table;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbSupplier")
@Data

public class TbSupplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String code;
    String title;
    String address;
    String phone;
    String homePhone;
    String perName;
    String fax;
    String taxCode;
    String note;
}
