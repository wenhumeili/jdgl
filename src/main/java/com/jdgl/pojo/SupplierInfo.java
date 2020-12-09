package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Data
public class SupplierInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supplierId;

    //供应商姓名
    @Column
    private String supplierName;

    //供应时间
    @Column
    private Date supplierTime;

    //一个供应商对应多个货物
    @OneToMany(mappedBy = "supplierInfo")
    private List<GoodsInfo> goodsInfoList;



}