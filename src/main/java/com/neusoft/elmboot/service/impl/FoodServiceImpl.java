package com.neusoft.elmboot.service.impl;


import com.neusoft.elmboot.bo.FoodBo;
import com.neusoft.elmboot.mapper.FoodMapper;
import com.neusoft.elmboot.po.Food;
import com.neusoft.elmboot.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.neusoft.elmboot.util.ModelConverterUtils.convert;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodMapper foodMapper;

    @Override
    public List<FoodBo> listFoodByBusinessId(Integer businessId) {
        return convert(foodMapper.listFoodByBusinessId(businessId), FoodBo.class);
    }


}
