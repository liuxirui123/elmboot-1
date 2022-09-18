package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.MyBatisUtil;
import com.neusoft.elmboot.po.Orders;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

public class OrdersMapperTest {
    SqlSession sqlSession = MyBatisUtil.getSqlSession();
    OrdersMapper oM = sqlSession.getMapper(OrdersMapper.class);

    @Test
    public void testSaveOrders() {
        Orders o = new Orders("test", 10001, 1, "test", 10.0);
        Assert.assertTrue(oM.saveOrders(o) > 0);
        sqlSession.rollback();
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
