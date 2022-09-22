package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.ElmBootApplication;
import com.neusoft.elmboot.TestUtil;
import com.neusoft.elmboot.po.Address;
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
        int[] aIds = {-1, 1, 2, 3, 4, 100001231};
        boolean[] ifNulls = {true, false, false, false, false, true};
        for (int i = 0; i < ifNulls.length; i++) {
            TestUtil.testGetSingle(aM.getAddressById(aIds[i]), ifNulls[i]);
        }
    }

    @Test
    @Transactional
    public void testSaveAddress() {
        int[] results = {1, 1};
        Address[] aList = {new Address(0, 0, "test"),
                new Address(0, 0)};


        for (int i = 0; i < results.length; i++) {
            Assert.assertEquals(results[i], aM.saveAddress(aList[i]));
        }
    }

    @Test
    @Transactional
    public void testUpdateAddress() {
        int[] results = {1, 1, 1, 0};
        Address[] aList = {new Address(1, 0, 0, "test"),
                new Address(2, 2, 0, "test"),
                new Address(5, 2, 0, "test"),
                new Address(-1, 2, 0, "test")};
        for (int i = 0; i < results.length; i++) {
            Assert.assertEquals(results[i], aM.updateAddress(aList[i]));
        }

    }
}
