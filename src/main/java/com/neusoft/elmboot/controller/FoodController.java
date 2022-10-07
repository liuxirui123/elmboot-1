package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.service.FoodService;
import com.neusoft.elmboot.vo.FoodVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.neusoft.elmboot.util.ModelConverterUtils.convert;

@RestController
@RequestMapping("/FoodController")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @RequestMapping("/listFoodByBusinessId")
    public List<FoodVo> listFoodByBusinessId(Integer businessId) {
        return convert(foodService.listFoodByBusinessId(businessId), FoodVo.class);
    }
}
