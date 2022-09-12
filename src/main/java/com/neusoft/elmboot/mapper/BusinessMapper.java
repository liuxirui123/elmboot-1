package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Business;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BusinessMapper {
	
	List<Business> listBusinessByOrderTypeId(Integer orderTypeId);
	
	Business getBusinessById(Integer businessId);
}
