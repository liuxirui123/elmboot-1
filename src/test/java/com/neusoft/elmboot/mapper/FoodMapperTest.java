package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.MyBatisUtil;
import com.neusoft.elmboot.po.Food;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FoodMapperTest {
    SqlSession sqlSession = MyBatisUtil.getSqlSession();
    FoodMapper fM = sqlSession.getMapper(FoodMapper.class);

    @Test
    public void testListFoodByBusinessId() {
        List<Food> fList = fM.listFoodByBusinessId(10001);
        Assert.assertTrue(fList.size() > 0);
        System.out.println(String.valueOf(fList.size()) + fList);

        fList = fM.listFoodByBusinessId(-1);
        Assert.assertEquals(0, fList.size());
        System.out.println(fList);
    }

    @Test
    public void testGetFOodById() {
        Food f = fM.getFoodById(1);
        Assert.assertNotNull(f);
        System.out.println(f);

        f = fM.getFoodById(2);
        Assert.assertNotNull(f);
        System.out.println(f);

        f = fM.getFoodById(-1);
        Assert.assertNull(f);
    }

}
