package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrdersMapper {


    int saveOrders(Orders orders);

    @Select("select * from orders where orderId=#{orderId}")
    Orders getOrdersById(Integer orderId);

    @Select("select * from orders where userId=#{userId}")
    List<Orders> listOrdersByUserId(String userId);
}
