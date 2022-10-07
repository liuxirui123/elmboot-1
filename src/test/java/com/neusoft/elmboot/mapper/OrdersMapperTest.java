package com.neusoft.elmboot.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class OrdersMapperTest {
@Autowired
private OrdersMapper oM ;

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
