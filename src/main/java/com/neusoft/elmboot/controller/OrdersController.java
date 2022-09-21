package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.bo.OrdersBo;
import com.neusoft.elmboot.po.Orders;
import com.neusoft.elmboot.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/OrdersController")
public class OrdersController {
    @Autowired

    private OrdersService ordersService;

    @RequestMapping("/createOrders")
    public int createOrders(Orders orders) {
        return ordersService.createOrders(orders);
    }

    @RequestMapping("/getOrdersById")
    public OrdersBo getOrdersById(Orders orders) {
        return ordersService.getOrdersById(orders.getOrderId());
    }

    @RequestMapping("/listOrdersByUserId")
    public List<OrdersBo> listOrdersByUserId(Orders orders) {
        return ordersService.listOrdersByUserId(orders.getUserId());
    }
}