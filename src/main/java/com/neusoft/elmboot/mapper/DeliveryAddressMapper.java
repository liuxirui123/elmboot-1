package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.DeliveryAddress;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeliveryAddressMapper {
	List<DeliveryAddress> listDeliveryAddressByUserId(String userId);
	
	DeliveryAddress getDeliveryAddressById(Integer daId);
	
	int saveDeliveryAddress(DeliveryAddress deliveryAddress);
	
	int updateDeliveryAddress(DeliveryAddress deliveryAddress);
	
	int removeDeliveryAddress(Integer daId);
	
}