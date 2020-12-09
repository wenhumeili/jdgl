package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class DesertInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer desertId;

//    private Integer departId;

    //甜品名
    @Column
    private String desertName;

    //甜品价格
    @Column
    private Double desertPrice;

}