package com.neusoft.elmboot.service;


import com.neusoft.elmboot.ElmBootApplication;
import com.neusoft.elmboot.TestUtil;
import com.neusoft.elmboot.po.Business;
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

import static com.neusoft.elmboot.TestCases.*;

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
        for (int id : businessOrderTypeIds) {
            TestUtil.testGetList(new ArrayList<>(bS.listBusinessByOrderTypeId(id)), false);
        }
        for (int id : businessOrderTypeIdsNot) {
            TestUtil.testGetList(new ArrayList<>(bS.listBusinessByOrderTypeId(id)), true);
        }
    }


    @Test
    public void testGetBusinessById() {
        for (int id : businessIds) {
            TestUtil.testGetSingle(bS.getBusinessById(id), false);
        }
        for (int id : businessIdsNOt) {
            TestUtil.testGetSingle(bS.getBusinessById(id), true);
        }
    }

    @Test
    public void testListRandomBusiness() {
        for (int i = 0; i < 10; i++) {
            Set<Business> bSet = new HashSet<>(bS.listRandomBusiness());
            Assert.assertEquals(5, bSet.size());
            System.out.println(bSet);
        }
    }


}
