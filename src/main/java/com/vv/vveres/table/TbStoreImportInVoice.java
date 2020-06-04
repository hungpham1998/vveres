package com.vv.vveres.table;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbStoreImportInVoice")
@Data


public class TbStoreImportInVoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String code;
    Date invoiceDate;
    String invoiceName;
    float payment;
    float deposit;
    float debt;
    double total;
    Byte status;
}
