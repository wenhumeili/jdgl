package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
public class VipDetail {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vipDetailId;

    //会员姓名
    @Column
    private String vipName;

    //会员积分
    @Column
    private Integer vipPoints;

    //会员性别
    @Column
    private String vipSex;

    //会员年龄
    @Column
    private Integer vipAge;

    //创建会员时间
    @Column
    private Date vipCreateTime;

    //会员地址
    @Column
    private String vipAddr;

    //定义一个一对一的关系
    // 映射
    @OneToOne(mappedBy = "vipDetail")
    private VipInfo vipInfo;

}