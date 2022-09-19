package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.OrderDetail;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderDetailMapper {

    @Insert("insert into orderDetail values(null,#{orderId},#{foodId},#{quantity})")
    int saveOrderDetail(OrderDetail od);

    @Select(" select * from orderDetail where orderId=#{orderId}")
    List<OrderDetail> listOrderDetailByOrderId(Integer orderOd);
}
