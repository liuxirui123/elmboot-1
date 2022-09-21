package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.bo.FoodBo;
import com.neusoft.elmboot.mapper.FoodMapper;
import com.neusoft.elmboot.po.Food;
import com.neusoft.elmboot.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodMapper foodMapper;

    @Override
    public List<FoodBo> listFoodByBusinessId(Integer businessId) {
        return PoToBo(foodMapper.listFoodByBusinessId(businessId));
    }

    private List<FoodBo> PoToBo(List<Food> fList) {
        List<FoodBo> fBoList = new ArrayList<>();
        for (Food f : fList) {
            fBoList.add(new FoodBo(f));
        }
        return fBoList;
    }
}
