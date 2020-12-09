package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class OrderDesertInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderDesertId;

    //甜品单价格
    @Column
    private Double orderDesertPrice;

    //定义一个一对一的关系
    // 映射
    @OneToOne(mappedBy = "orderDesertInfo")
    private OrderInfo orderInfo;
}