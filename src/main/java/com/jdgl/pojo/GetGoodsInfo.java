package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
public class GetGoodsInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer getGoodsId;


//    private Integer goodsId;一对多

//    private Integer departId;一对一

    //部门领取货物的数量
    @Column
    private Integer getGoodsNum;

    //领取货物的时间
    @Column
    private Date getGoodsTime;

}