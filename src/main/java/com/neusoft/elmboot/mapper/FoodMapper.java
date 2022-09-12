package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodMapper {
	List<Food> listFoodByBusinessId(Integer businessId);
	
	Food getFoodById(Integer foodId);
}
