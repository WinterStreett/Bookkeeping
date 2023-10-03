package com.winterstreet.bookkeeping.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer uid;

    @Column(name = "项目")
    private String item;

    @Column(name = "金额")
    private Integer amount;

    @Column(name = "时间")
    private Integer month;
}
