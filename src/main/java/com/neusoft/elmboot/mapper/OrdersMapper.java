package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface OrdersMapper {


    int saveOrders(Orders orders);

    @Select("select * from orders where orderId=#{orderId}")
    Orders getOrdersById(Integer orderId);

    @Update("update orders set orderState=1 where orderId=#{orderId}")
    int updateOrderStateById(Integer orderId);

    @Select("select * from orders where userId=#{userId}")
    List<Orders> listOrdersByUserId(String userId);
}
