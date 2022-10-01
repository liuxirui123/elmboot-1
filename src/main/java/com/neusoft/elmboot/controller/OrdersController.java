package com.neusoft.elmboot.controller;

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
    public Orders getOrdersById(Integer orderId) {
        return ordersService.getOrdersById(orderId);
    }


    @RequestMapping("/updateOrderStateById")
    public int updateOrderStateById(Integer orderId) {
        return ordersService.updateOrderStateById(orderId);
    }

    @RequestMapping("/listOrdersByUserId")
    public List<Orders> listOrdersByUserId(String userId) {
        return ordersService.listOrdersByUserId(userId);
    }
}