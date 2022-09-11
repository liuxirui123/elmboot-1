package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.List;

@Mapper
public interface OrdersMapper {
	
	@Insert("insert into orders values(#{userId},#{businessId},#{orderDate},#{orderTotal},#{daId},0)")
	@Options(useGeneratedKeys = true, keyProperty = "orderId", keyColumn = "orderId")
	int saveOrders(Orders orders);
	
	//@Select("select * from orders where orderId=#{orderId}")
	Orders getOrdersById(Integer orderId);
	
	//@Select("select * from orders where orderId=#{orderId} order by foodId")
	List<Orders> listOrdersByUserId(String userId);
}
