package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class OrderDishesInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderDishesId;

    //菜品单价格
    @Column
    private Double orderDishesPrice;

    //定义一个一对一的关系
    // 映射
    @OneToOne(mappedBy = "orderDishesInfo")
    private OrderInfo orderInfo;

}