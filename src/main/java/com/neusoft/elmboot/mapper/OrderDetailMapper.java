package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDetailMapper {
	int saveOrderDetailBatch(List<OrderDetail> list);
	
	List<OrderDetail> listOrderDetailByOrderId(Integer orderOd);
}
