package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class GoodsInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer goodsId;

    //货物名
    @Column
    private String goodsName;

    //货物价格
    @Column
    private Double goodsPrice;

    //货物数量
    @Column
    private Integer goodsNum;

    //一个供应商对应多个货物
    @ManyToOne(cascade = {CascadeType.REMOVE,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn(name = "supplier_id")
    private SupplierInfo supplierInfo;

}