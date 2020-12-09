package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
public class GoodsInputInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer goodsInputId;

    //进货数量
    @Column
    private Integer goodsNum;

    //进货时间
    @Column
    private Date inputTime;

//    private Integer supplierId;

//    private Integer goodsId;

}