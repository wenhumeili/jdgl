package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class DeskInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deskId;

    //桌位预定状态：早 0未预定，1已预订
    @Column
    private Integer deskStateMor;

    //桌位预定状态：中 0未预定，1已预订
    @Column
    private Integer deskStateNoon;

    //桌位预定状态：晚 0未预定，1已预订
    @Column
    private Integer deskStateEve;

    //桌位可坐人数量
    @Column
    private Integer persNum;

    //一张桌子对应多个订单
    @OneToMany
    private List<OrderInfo> orderInfoList;

}