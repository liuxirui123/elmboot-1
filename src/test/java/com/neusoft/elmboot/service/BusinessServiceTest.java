package com.neusoft.elmboot.service;


import com.neusoft.elmboot.ElmBootApplication;
import com.neusoft.elmboot.TestUtil;
import com.neusoft.elmboot.bo.BusinessBo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static com.neusoft.elmboot.TestUtil.testGetSingle;

@SpringBootTest(classes = ElmBootApplication.class)
@RunWith(SpringRunner.class)
@Transactional
public class BusinessServiceTest {
    @Autowired
    private BusinessService bS;


    @Test
    public void testListBusiness() {
        TestUtil.testGetList(new ArrayList<>(bS.listBusiness()), false);
    }

    @Test
    public void testListBusinessByOrderTypeId() {
        int[] orderTypeIds = {1, 4, 0};
        boolean[] ifNulls = {false, false, true};
        for (int i = 0; i < ifNulls.length; i++) {
            TestUtil.testGetList(new ArrayList<>(bS.listBusinessByOrderTypeId(orderTypeIds[i])), ifNulls[i]);
        }
    }


    @Test
    public void testGetBusinessById() {
        testGetSingle(bS.getBusinessById(10001), false);

        testGetSingle(bS.getBusinessById(0), true);
    }

    @Test
    public void testListRandomBusiness() {
        for (int i = 0; i < 10; i++) {
            Set<BusinessBo> bBoSet = new HashSet<>(bS.listRandomBusiness());
            Assert.assertEquals(5, bBoSet.size());
            System.out.println(bBoSet);
        }
    }


}
