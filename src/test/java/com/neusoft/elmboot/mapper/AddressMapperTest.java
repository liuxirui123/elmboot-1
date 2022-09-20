package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.ElmBootApplication;
import com.neusoft.elmboot.MyBatisUtil;
import com.neusoft.elmboot.po.Address;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest(classes = ElmBootApplication.class)
@RunWith(SpringRunner.class)
@Transactional
public class AddressMapperTest {

    @Autowired
    AddressMapper aM;

    @Test
    public void testGetAddressById() {
        Address a = aM.getAddressById(1);
        Assert.assertNotNull(a);
        System.out.println(a);

        a = aM.getAddressById(0);
        Assert.assertNull(a);
    }

    @Test
    public void testSaveAddress() {
        Address a = new Address(0, 0, "test");
        Assert.assertEquals(1, aM.saveAddress(a));

        a = new Address(0, 0);
        Assert.assertEquals(1, aM.saveAddress(a));

    }
}
