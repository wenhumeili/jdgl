package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class VipInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vipId;

    //会员登录名
    @Column
    private String vidUsername;


    //会员密码
    @Column
    private String vipPwd;

    //一对一
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vip_detail_id",referencedColumnName = "vipDetailId")
    private VipDetail vipDetail;



}