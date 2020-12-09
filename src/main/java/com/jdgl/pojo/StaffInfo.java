package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class StaffInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer staffId;

    //员工登录名
    @Column
    private String staffUsername;

    //员工密码
    @Column
    private String staffPwd;

    //一对一staffdetail
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_detail_id",referencedColumnName = "staffDetailId")
    private StaffDetail staffDetail;

    //多对对roleinfo
    @ManyToMany(cascade = CascadeType.ALL)
    //                  中间表
    @JoinTable(name = "staff_role_rel",
            joinColumns = {@JoinColumn(name ="staff_id")},//当前表的外键在中间表的列名
            inverseJoinColumns = {@JoinColumn(name = "role_id")})//和当前多对多的
    private List<RoleInfo> roleInfoList;
}