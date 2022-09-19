package com.neusoft.elmboot.po;

public class OrderDetail {

    private Integer odId;
    private Integer orderId;
    private Integer foodId;
    private Integer quantity;

    public OrderDetail(Integer orderId, Integer foodId, Integer quantity) {
        this.orderId = orderId;
        this.foodId = foodId;
        this.quantity = quantity;
    }

    public Integer getOdId() {
        return odId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
