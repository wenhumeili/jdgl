package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class DishesInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dishesId;

//    private Integer departId;

    //菜品名
    @Column
    private String dishesName;

    //菜品价格
    @Column
    private Double dishesPrice;

}