package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class PermissionInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer permissionId;

    //权限名
    @Column
    private String permissionName;

    //父id
    @Column
    private Integer parentId;

    //权限类型
    @Column
    private String type;

    //地址链接
    @Column
    private String url;

    //状态 0异常 1正常  默认为1
    @Column
    private Integer state;

    //多对对roleinfo
    @ManyToMany(cascade = CascadeType.ALL)
    //                  中间表
    @JoinTable(name = "role_permission_rel",
            joinColumns = {@JoinColumn(name ="role_id")},//当前表的外键在中间表的列名
            inverseJoinColumns = {@JoinColumn(name = "permission_id")})//和当前多对多的
    private List<RoleInfo> roleInfoList;

}