package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class RoleInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;

    //角色名
    @Column
    private String roleName;


    //多对多staffinfo
    @ManyToMany(cascade = CascadeType.ALL)
    //                  中间表
    @JoinTable(name = "staff_role_rel",
            joinColumns = {@JoinColumn(name ="role_id")},//当前表的外键在中间表的列名
            inverseJoinColumns = {@JoinColumn(name = "staff_id")})//和当前多对多的
    private List<StaffInfo> staffInfoList;


    //多对多permissioninfo
    @ManyToMany(cascade = CascadeType.ALL)
    //                  中间表
    @JoinTable(name = "role_permission_rel",
            joinColumns = {@JoinColumn(name ="role_id")},//当前表的外键在中间表的列名
            inverseJoinColumns = {@JoinColumn(name = "permission_id")})//和当前多对多的
    private List<PermissionInfo> permissionInfoList;
}