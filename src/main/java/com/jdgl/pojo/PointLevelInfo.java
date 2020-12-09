package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class PointLevelInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer levelId;


    //等级所需最低积分
    @Column
    private Integer point;

    //折扣
    @Column
    private Double discount;

    //一对一
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vip_id",referencedColumnName = "vipId")
    private VipInfo vipInfo;

}