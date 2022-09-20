package com.neusoft.elmboot.service;

import com.neusoft.elmboot.bo.OrdersBo;
import com.neusoft.elmboot.po.Orders;

import java.util.List;

public interface OrdersService {
    public int createOrders(Orders orders);

    public OrdersBo getOrdersById(Integer orderId);

    public List<OrdersBo> listOrdersByUserId(String userId);
}