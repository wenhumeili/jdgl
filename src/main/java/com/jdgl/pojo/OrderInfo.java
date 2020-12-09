package com.jdgl.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
public class OrderInfo {
    //创建主键
    @Id//主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;


    //订单总价
    @Column
    private Double orderTotalPrice;

    //订单产生时间
    @Column
    private Date orderTime;

    @ManyToOne(cascade = {CascadeType.REMOVE,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn(name = "desk_id")
    private DeskInfo deskInfo;

    //一对一
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_desert_id",referencedColumnName = "orderDesertId")
    private OrderDesertInfo orderDesertInfo;

    //一对一
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_drink_id",referencedColumnName = "orderDrinkId")
    private OrderDrinkInfo orderDrinkInfo;

    //一对一
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_dishes_id",referencedColumnName = "orderDishesId")
    private OrderDishesInfo orderDishesInfo;

}