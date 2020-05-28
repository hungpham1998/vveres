package com.vv.vveres.table;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "tbImportDetail")
@Data
public class TbImportDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Boolean active;
    Double debtmoney;
    Double discount_mo;
    Double discount_mo1;
    Double discount_per;
    Double free_num;
    Double import_num;
    Double import_price;
    Double total;
    String note;
    Date expiry_date;
    Long uni_id;
    Long restaurant_id;
    Long invoice_id;
}
