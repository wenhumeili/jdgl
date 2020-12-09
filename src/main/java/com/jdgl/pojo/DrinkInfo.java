package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class DrinkInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer drinkId;

//    private Integer departId;

    //酒水名
    @Column
    private String drinkName;

    //酒水价格
    @Column
    private Double drinkPrice;

}