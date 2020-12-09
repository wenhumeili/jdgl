package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data

public class DailyDetailAccount {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    //当天结算收入
    @Column
    private Double account;

    //挂账数量
    @Column
    private Integer creditNum;

    //开桌人数
    @Column
    private Integer totalPersNum;

    //菜品部门营业收入
    @Column
    private Double dishesDepartAccount;

    //甜品部门营业收入
    @Column
    private Double desertDepartAccount;

    //酒水部门营业收入
    @Column
    private Double drinkDepartAccount;

}