package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

public class OrdersMapperTest {
    SqlSession sqlSession = MyBatisUtil.getSqlSession();
    OrdersMapper oM = sqlSession.getMapper(OrdersMapper.class);

    @Test
    public void testSaveOrders() {
//        OrdersEntity o = new OrdersEntity("test", 10001,  1,10.0,"test");
//        Assert.assertTrue(oM.createOrders(o) > 0);
//        sqlSession.rollback();
    }

    @Test
    public void testGetOrderById() {
        Assert.assertNull(oM.getOrdersById(0));
    }

    @Test
    public void testListOrdersByUserId() {
        Assert.assertEquals(0, oM.listOrdersByUserId("").size());
    }
}
