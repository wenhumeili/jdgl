package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class OrderDrinkInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderDrinkId;

    //酒水单价格
    @Column
    private Double orderDrinkPrice;

    //定义一个一对一的关系
    // 映射
    @OneToOne(mappedBy = "orderDrinkInfo")
    private OrderInfo orderInfo;

}