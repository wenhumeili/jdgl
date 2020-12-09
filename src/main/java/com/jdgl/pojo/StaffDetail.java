package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class StaffDetail {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer staffDetailId;

    //员工姓名
    @Column
    private String staffName;


//    private Integer departId;

//    private Integer leaderId;

    //一对一的关系staffinfo
    // 映射
    @OneToOne(mappedBy = "staffDetail")
    private StaffInfo staffInfo;

}