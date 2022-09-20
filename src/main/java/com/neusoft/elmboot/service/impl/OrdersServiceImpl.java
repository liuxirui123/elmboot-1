package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.bo.BusinessBo;
import com.neusoft.elmboot.bo.DeliveryAddressBo;
import com.neusoft.elmboot.bo.OrderDetailBo;
import com.neusoft.elmboot.bo.OrdersBo;
import com.neusoft.elmboot.mapper.*;
import com.neusoft.elmboot.po.*;
import com.neusoft.elmboot.service.OrdersService;
import com.neusoft.elmboot.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Autowired
    private BusinessMapper businessMapper;

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private DeliveryAddressMapper deliveryAddressMapper;

    @Autowired
    private FoodMapper foodMapper;

    @Override
    @Transactional
    public int createOrders(Orders orders) {
        //1、查询当前用户购物车中当前商家的所有食品
        Cart cart = new Cart(orders.getBusinessId(), orders.getUserId());
        List<Cart> cartList = cartMapper.listCart(cart);

        //2、创建订单（返回生成的订单编号）
        orders.setOrderDate(CommonUtil.getCurrentDate());
        ordersMapper.saveOrders(orders);
        int orderId = orders.getOrderId();

        //3、批量添加订单明细
        for (Cart c : cartList) {
            OrderDetail od=new OrderDetail(orderId, c.getFoodId(), c.getQuantity());
            orderDetailMapper.saveOrderDetail(od);
        }

        //4、从购物车表中删除相关食品信息
        cartMapper.removeCart(cart);

        return orderId;
    }

    @Override
    public OrdersBo getOrdersById(Integer orderId) {
        return PoToBo(ordersMapper.getOrdersById(orderId));
    }

    @Override
    public List<OrdersBo> listOrdersByUserId(String userId) {
        return PoToBo(ordersMapper.listOrdersByUserId(userId));
    }

    private OrdersBo PoToBo(Orders o) {
        Business b = businessMapper.getBusinessById(o.getBusinessId());
        BusinessBo bB = new BusinessBo(b, addressMapper.getAddressById(b.getAddressId()));

        DeliveryAddress da = deliveryAddressMapper.getDeliveryAddressById(o.getDaId());
        DeliveryAddressBo daB = new DeliveryAddressBo(da, addressMapper.getAddressById(da.getAddressId()));

        List<OrderDetailBo> odBList = new ArrayList<>();
        for (OrderDetail od : orderDetailMapper.listOrderDetailByOrderId(o.getOrderId())) {
            odBList.add(new OrderDetailBo(od, foodMapper.getFoodById(od.getFoodId())));
        }
        return new OrdersBo(o, bB, daB, odBList);
    }

    private List<OrdersBo> PoToBo(List<Orders> oList) {
        List<OrdersBo> obList = new ArrayList<>();
        for (Orders o : oList) {
            obList.add(PoToBo(o));
        }
        return obList;
    }
}
