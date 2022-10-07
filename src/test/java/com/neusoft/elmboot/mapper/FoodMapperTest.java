package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.TestUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

import static com.neusoft.elmboot.TestCases.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class FoodMapperTest {
    @Autowired
    FoodMapper fM;

    @Test
    public void testListFoodByBusinessId() {
        for (int id : businessIds) {
            TestUtil.testGetList(new ArrayList<>(fM.listFoodByBusinessId(id)), false);
        }
        for (int id : businessIdsNOt) {
            TestUtil.testGetList(new ArrayList<>(fM.listFoodByBusinessId(id)), true);
        }
    }

    @Test
    public void testGetFOodById() {
        for (int id : foodIds) {
            TestUtil.testGetSingle(fM.getFoodById(id), false);
        }
        for (int id : foodIdsNot) {
            TestUtil.testGetSingle(fM.getFoodById(id), true);
        }
    }

}
