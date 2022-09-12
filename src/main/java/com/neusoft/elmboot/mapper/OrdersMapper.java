package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdersMapper {
	
	int saveOrders(Orders orders);
	
	//@Select("select * from orders where orderId=#{orderId}")
	Orders getOrdersById(Integer orderId);
	
	//@Select("select * from orders where orderId=#{orderId} order by foodId")
	List<Orders> listOrdersByUserId(String userId);
}
