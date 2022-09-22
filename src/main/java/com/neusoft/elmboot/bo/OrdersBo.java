package com.neusoft.elmboot.bo;

import com.neusoft.elmboot.po.Orders;

import java.util.List;

public class OrdersBo {

    private Integer orderId;
    private String userId;
    private Integer orderState; //订单状态（0：未支付； 1：已支付）
    private String orderDate;
    private Double orderTotal;
    private BusinessBo businessBo;//多对一：所属商家
    private DeliveryAddressBo daBo;
    private List<OrderDetailBo> odBoList;//一对多：订单明细

    public OrdersBo(Orders o) {
        this.orderId = o.getOrderId();
        this.userId = o.getUserId();
        this.orderState = o.getOrderState();
        this.orderDate = o.getOrderDate();
        this.orderTotal = o.getOrderTotal();
    }

    public OrdersBo(Orders o, BusinessBo businessBo, DeliveryAddressBo daBo, List<OrderDetailBo> odBoList) {
        this(o);
        this.businessBo = businessBo;
        this.daBo = daBo;
        this.odBoList = odBoList;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public BusinessBo getBusinessBo() {
        return businessBo;
    }

    public void setBusinessBo(BusinessBo businessBo) {
        this.businessBo = businessBo;
    }

    public DeliveryAddressBo getDaBo() {
        return daBo;
    }

    public void setDaBo(DeliveryAddressBo daBo) {
        this.daBo = daBo;
    }

    public List<OrderDetailBo> getOdBoList() {
        return odBoList;
    }

    public void setOdBoList(List<OrderDetailBo> odBoList) {
        this.odBoList = odBoList;
    }
}