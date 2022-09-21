package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.MyBatisUtil;
import com.neusoft.elmboot.TestUtil;
import com.neusoft.elmboot.po.Food;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FoodMapperTest {
    SqlSession sqlSession = MyBatisUtil.getSqlSession();
    FoodMapper fM = sqlSession.getMapper(FoodMapper.class);

    @Test
    public void testListFoodByBusinessId() {
        int[] businessIds = {-1, 1, 10001, 10002, 10000000};
        boolean[] ifNulls = {true, true, false, false, true};
        for (int i = 0; i < ifNulls.length; i++) {
            TestUtil.testList(new ArrayList<>(fM.listFoodByBusinessId(businessIds[i])), ifNulls[i]);
        }

    }

    @Test
    public void testGetFOodById() {
        int[] foodIds = {-1, 0, 1, 2, 3, 4, 5};
        boolean[] ifNulls = {true, true, false, false, false, false, false};
        for(int i=0;i<ifNulls.length;i++){
            TestUtil.testSingle(fM.getFoodById(foodIds[i]),ifNulls[i]);
        }

    }

}
