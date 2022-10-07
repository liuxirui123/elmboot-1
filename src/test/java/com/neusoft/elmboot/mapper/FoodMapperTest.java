package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.TestUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class FoodMapperTest {
   @Autowired
    FoodMapper fM ;

    @Test
    public void testListFoodByBusinessId() {
        int[] businessIds = {-1, 1, 10001, 10002, 10000000};
        boolean[] ifNulls = {true, true, false, false, true};
        for (int i = 0; i < ifNulls.length; i++) {
            TestUtil.testGetList(new ArrayList<>(fM.listFoodByBusinessId(businessIds[i])), ifNulls[i]);
        }

    }

    @Test
    public void testGetFOodById() {
        int[] foodIds = {-1, 0, 1, 2, 3, 4, 5};
        boolean[] ifNulls = {true, true, false, false, false, false, false};
        for (int i = 0; i < ifNulls.length; i++) {
            TestUtil.testGetSingle(fM.getFoodById(foodIds[i]), ifNulls[i]);
        }

    }

}
