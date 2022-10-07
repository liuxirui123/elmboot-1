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
public class OrderDetailMapperTest {
    @Autowired
   private OrderDetailMapper oDM ;

    @Test
    public void testSaveOrderDetailBatch() {
//        OrderDetailEntity od = new OrderDetailEntity(1, 1, 1);
//
//        Assert.assertEquals(1, oDM.saveOrderDetail(od));
//
//        sqlSession.rollback();
    }

    @Test
    public void testListOrderDetailByOrderId() {
        Assert.assertEquals(0, oDM.listOrderDetailByOrderId(0).size());
    }


}
