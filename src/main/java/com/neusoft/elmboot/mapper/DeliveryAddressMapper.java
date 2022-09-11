package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.DeliveryAddress;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeliveryAddressMapper {
	@Select("select * from deliveryAddress where userId=#{userId} order by daId")
	List<DeliveryAddress> listDeliveryAddressByUserId(String userId);
	
	@Select("select * from deliveryAddress where daId=#{daId}")
	DeliveryAddress getDeliveryAddressById(Integer daId);
	
	@Insert("insert into deliveryAddress values(null,#{contactName},#{contactSex},#{contactTel},#{address},#{userId})")
	int saveDeliveryAddress(DeliveryAddress deliveryAddress);
	
	@Update("update deliveryAddress set contactName=#{contactName},contactSex=#{contactSex},contactTel=#{contactTel},address=#{address} where daId=#{daId}")
	int updateDeliveryAddress(DeliveryAddress deliveryAddress);
	
	@Delete("delete from deliveryAddress where daId=#{daId}")
	int removeDeliveryAddress(Integer daId);
	
}