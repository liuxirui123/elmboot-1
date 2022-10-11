package com.neusoft.elmboot.po;

import java.util.List;

public abstract class Orders {

    private String userId;
    private Integer businessId;
    private Integer daId; //送货地址编号
    private Integer orderState; //订单状态（0：未支付； 1：已支付）

    private String orderDate;
    private Double orderTotal;

    private Business business;
    private List<OrderDetail> oDList;

}