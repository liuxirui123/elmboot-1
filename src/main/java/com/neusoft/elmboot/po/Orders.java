package com.neusoft.elmboot.po;

import java.util.List;

public class Orders {

private Integer orderId;
private String userId;
private Integer businessId;
private String orderDate;
private Double orderTotal;
private Integer daId; //送货地址编号
private Integer orderState; //订单状态（0：未支付； 1：已支付）

private Business business;//多对一：所属商家

private List<OrderDetail> list;//一对多：订单明细

public Orders() {

}

public Orders(String userId, Integer businessId, Integer daId) {
	this.userId = userId;
	this.businessId = businessId;
	this.daId = daId;
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

public Integer getBusinessId() {
	return businessId;
}

public void setBusinessId(Integer businessId) {
	this.businessId = businessId;
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

public Integer getDaId() {
	return daId;
}

public void setDaId(Integer daId) {
	this.daId = daId;
}

public Integer getOrderState() {
	return orderState;
}

public void setOrderState(Integer orderState) {
	this.orderState = orderState;
}

public Business getBusiness() {
	return business;
}

public void setBusiness(Business business) {
	this.business = business;
}

public List<OrderDetail> getList() {
	return list;
}

public void setList(List<OrderDetail> list) {
	this.list = list;
}
}