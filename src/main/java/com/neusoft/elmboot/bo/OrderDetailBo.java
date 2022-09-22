package com.neusoft.elmboot.bo;

import com.neusoft.elmboot.po.OrderDetail;

public class OrderDetailBo {
    private Integer odId;
    private Integer orderId;
    private Integer quantity;
    private FoodBo foodBo;

    public OrderDetailBo() {
    }

    public OrderDetailBo(OrderDetail od) {
        this.odId = od.getOdId();
        this.orderId = od.getOrderId();
        this.quantity = od.getQuantity();
    }

    public OrderDetailBo(OrderDetail od, FoodBo fB){
        this(od);
        this.foodBo=fB;
    }

    public Integer getOdId() {
        return odId;
    }

    public void setOdId(Integer odId) {
        this.odId = odId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public FoodBo getFoodBo() {
        return foodBo;
    }

    public void setFoodBo(FoodBo foodBo) {
        this.foodBo = foodBo;
    }
}
