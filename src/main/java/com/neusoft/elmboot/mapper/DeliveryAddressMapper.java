package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.DeliveryAddress;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface DeliveryAddressMapper {

    @Select("select * from deliveryAddress where userId=#{userId} and delTag=1 order by daId")
    List<DeliveryAddress> listDeliveryAddressByUserId(String userId);

    @Select("select * from deliveryAddress where daId=#{daId} and delTag=1")
    DeliveryAddress getDeliveryAddressById(Integer daId);

    @Insert("insert into deliveryAddress values(null,#{addressId},#{userId},#{contactName},#{contactSex},#{contactTel},1)")
    int saveDeliveryAddress(DeliveryAddress deliveryAddress);

    @Update("update deliveryAddress set contactName=#{contactName},contactSex=#{contactSex},contactTel=#{contactTel},addressId=#{addressId} where daId=#{daId} ")
    int updateDeliveryAddress(DeliveryAddress deliveryAddress);

    @Update("update deliveryAddress set delTag=0 where daId=#{daId}")
    int removeDeliveryAddress(Integer daId);

}