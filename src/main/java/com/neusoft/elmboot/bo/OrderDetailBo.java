package com.neusoft.elmboot.bo;

import com.neusoft.elmboot.po.OrderDetail;

public class OrderDetailBo {
    private Integer odId;
    private Integer orderId;
    private Integer quantity;
    private FoodBo foodBo;

    public OrderDetailBo(OrderDetail od) {
        this.odId = od.getOdId();
        this.orderId = od.getOrderId();
        this.quantity = od.getQuantity();
    }

    public OrderDetailBo(OrderDetail od, FoodBo fB){
        this(od);
        this.foodBo=fB;
    }

}
