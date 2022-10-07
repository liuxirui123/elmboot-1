package com.neusoft.elmboot.service;

import com.neusoft.elmboot.bo.FoodBo;
import com.neusoft.elmboot.po.Food;

import java.util.List;

public interface FoodService {
    public List<FoodBo> listFoodByBusinessId(Integer businessId);
}