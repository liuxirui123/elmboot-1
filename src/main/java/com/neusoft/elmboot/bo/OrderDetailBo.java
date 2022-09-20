package com.neusoft.elmboot.bo;

import com.neusoft.elmboot.po.Food;
import com.neusoft.elmboot.po.OrderDetail;

public class OrderDetailBo {
    private Integer odId;
    private Integer orderId;
    private Integer quantity;
    private Food f;

    public OrderDetailBo(OrderDetail od) {
        this.odId = od.getOdId();
        this.orderId = od.getOrderId();
        this.quantity = od.getQuantity();
    }

    public OrderDetailBo(OrderDetail od, Food f){
        this(od);
        this.f=f;
    }

}
