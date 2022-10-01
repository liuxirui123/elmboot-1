package com.neusoft.elmboot.service;


import com.neusoft.elmboot.ElmBootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = ElmBootApplication.class)
@RunWith(SpringRunner.class)
@Transactional
public class OrdersServiceTest {

    @Autowired
    OrdersService oS;

    @Test
    public void testCreateOrders() {
//        OrdersEntity o=new OrdersEntity("111",10001,8,82.0);
//        int orderId=oS.createOrders(o);
//        System.out.println(orderId);
//        Assert.assertTrue(orderId>0);
    }

}
