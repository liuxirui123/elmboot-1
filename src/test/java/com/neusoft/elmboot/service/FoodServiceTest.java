package com.neusoft.elmboot.service;

import com.neusoft.elmboot.po.Food;
import com.neusoft.elmboot.service.impl.FoodServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FoodServiceTest {
    FoodService fs = new FoodServiceImpl();

    @Test
    public void testListFoodByBusinessId() {
        List<Food> fList = fs.listFoodByBusinessId(10001);
        Assert.assertNotNull(fList);
        System.out.println(fList);
    }
}
