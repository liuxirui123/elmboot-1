package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.OrderDetail;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderDetailMapper {

    int saveOrderDetail(OrderDetail od);

    List<OrderDetail> listOrderDetailByOrderId(Integer orderOd);
}
