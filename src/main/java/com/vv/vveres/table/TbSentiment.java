package com.vv.vveres.table;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "tbSentiment")
@Data
public class TbSentiment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String namefile;
    String content;
    String qa;
    long tgian;
    long tongtg;
    int sentiment;
}
