package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.mapper.CartMapper;
import com.neusoft.elmboot.mapper.OrderDetailMapper;
import com.neusoft.elmboot.mapper.OrdersMapper;
import com.neusoft.elmboot.po.Orders;
import com.neusoft.elmboot.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    @Transactional
    public int createOrders(Orders orders) {
//        //1、查询当前用户购物车中当前商家的所有食品
//        List<Cart> cartList = cartMapper.listCart(cart);
//
//        //2、创建订单（返回生成的订单编号）
//        orders.setOrderDate(CommonUtil.getCurrentDate());
//        ordersMapper.createOrders(orders);
//        int orderId = orders.getOrderId();
//
//        //3、批量添加订单明细
//        for (CartEntity c : cartList) {
//            OrderDetailEntity od = new OrderDetailEntity(orderId, c.getFoodId(), c.getQuantity());
//            orderDetailMapper.saveOrderDetail(od);
//        }
//
//        //4、从购物车表中删除相关食品信息
//        cartMapper.removeCart(cart);
//
//        return orderId;
        return 0;
    }


    @Override
    public Orders getOrdersById(Integer orderId) {
        return ordersMapper.getOrdersById(orderId);
    }

    @Override
    public int updateOrderStateById(Integer orderId) {
        return ordersMapper.updateOrderStateById(orderId);
    }

    @Override
    public List<Orders> listOrdersByUserId(String userId) {
        return ordersMapper.listOrdersByUserId(userId);
    }


}
