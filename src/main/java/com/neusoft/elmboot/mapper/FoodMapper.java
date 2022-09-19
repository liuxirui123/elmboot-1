package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Food;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FoodMapper {

    @Select("select * from food where businessId=#{businessId} order by foodId")
    List<Food> listFoodByBusinessId(Integer businessId);

    @Select("select * from food where foodId=#{foodId}")
    Food getFoodById(Integer foodId);
}
