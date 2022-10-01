package com.neusoft.elmboot.mapper;


import com.neusoft.elmboot.po.Business;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BusinessMapper {

    @Select("select * from business order by businessId")
    List<Business> listBusiness();

    @Select("select * from business where orderTypeId=#{orderTypeId} order by businessId")
    List<Business> listBusinessByOrderTypeId(Integer orderTypeId);

    @Select("select * from business where businessId=#{businessId}")
    Business getBusinessById(Integer businessId);
}
