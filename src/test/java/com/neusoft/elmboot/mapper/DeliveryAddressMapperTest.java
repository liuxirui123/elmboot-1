package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.DeliveryAddress;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class DeliveryAddressMapperTest {
    @Autowired
    private DeliveryAddressMapper dAM ;


    @Test
    public void testListDeliveryAddressByUserId() {
        List<DeliveryAddress> daList = dAM.listDeliveryAddressByUserId("12345672222");
        System.out.println(String.valueOf(daList.size()) + daList);
        Assert.assertTrue(daList.size() > 0);

        daList = dAM.listDeliveryAddressByUserId("1");
        System.out.println(String.valueOf(daList.size()) + daList);
        Assert.assertEquals(0, daList.size());

    }

    @Test
    public void testGetDeliveryAddressByUserId() {
        DeliveryAddress da = dAM.getDeliveryAddressById(1);
        System.out.println(da);
        Assert.assertNotNull(da);

        da = dAM.getDeliveryAddressById(-1);
        Assert.assertNull(da);
    }

//    @Test
//    public void testSaveDeliveryAddress() {
//        int result = dAM.saveDeliveryAddress(da);
//        Assert.assertEquals(1, result);
//        sqlSession.rollback();
//    }
//
//    @Test
//    public void testUpdateDeliveryAddress() {
//        int result = dAM.updateDeliveryAddress(da);
//        Assert.assertEquals(0, result);
//        sqlSession.rollback();
//
//    }

    @Test
    public void testRemoveDeliveryAddress() {
        int result = dAM.removeDeliveryAddress(1);
        Assert.assertEquals(1, result);

        result = dAM.removeDeliveryAddress(0);
        System.out.println(result);
        Assert.assertTrue(result <= 0);

    }
}
