package com.neusoft.elmboot.po;

public class Orders {

    private Integer orderId;
    private String userId;
    private Integer businessId;
    private Integer daId; //送货地址编号
    private Integer orderState; //订单状态（0：未支付； 1：已支付）

    private String orderDate;
    private Double orderTotal;

    public Orders() {
    }

    public Orders(String userId, Integer businessId, Integer daId, Double orderTotal) {
        this.userId = userId;
        this.businessId = businessId;
        this.daId = daId;
        this.orderTotal = orderTotal;
    }

    public Orders(String userId, Integer businessId, Integer daId, Double orderTotal,String orderDate) {
        this(userId,businessId,daId,orderTotal);
        this.orderDate=orderDate;
    }


    public Integer getOrderId() {
        return orderId;
    }

    public String getUserId() {
        return userId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public Integer getDaId() {
        return daId;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public Double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderDate(String currentDate) {
        this.orderDate = currentDate;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public void setDaId(Integer daId) {
        this.daId = daId;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public void setOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
    }
}