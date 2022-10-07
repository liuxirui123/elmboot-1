package com.neusoft.elmboot.mapper;


import com.neusoft.elmboot.entity.BusinessEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BusinessMapper {

    @Select("select * from business order by businessId")
    List<BusinessEntity> listBusiness();

    @Select("select * from business where orderTypeId=#{orderTypeId} order by businessId")
    List<BusinessEntity> listBusinessByOrderTypeId(Integer orderTypeId);

    @Select("select * from business where businessId=#{businessId}")
    BusinessEntity getBusinessById(Integer businessId);
}
