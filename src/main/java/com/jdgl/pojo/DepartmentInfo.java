package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class DepartmentInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departId;

    //部门名
    @Column
    private String departName;

    //主管ID
    @Column
    private Integer leaderId;

    //主管姓名
    @Column
    private String leaderName;

}