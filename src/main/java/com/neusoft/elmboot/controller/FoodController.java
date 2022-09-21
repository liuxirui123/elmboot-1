package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.bo.FoodBo;
import com.neusoft.elmboot.po.Food;
import com.neusoft.elmboot.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/FoodController")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @RequestMapping("/listFoodByBusinessId")
    public List<FoodBo> listFoodByBusinessId(Food f) {
        return foodService.listFoodByBusinessId(f.getBusinessId());
    }
}
