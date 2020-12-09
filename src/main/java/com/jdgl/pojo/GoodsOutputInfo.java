package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
public class GoodsOutputInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer goodsOutputId;

    //退货数量
    @Column
    private Integer goodsOutNum;

    //退货时间
    @Column
    private Date outputTime;



//    private Integer supplierId;

//    private Integer goodsId;


}