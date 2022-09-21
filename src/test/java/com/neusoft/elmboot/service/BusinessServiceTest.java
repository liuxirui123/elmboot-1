package com.neusoft.elmboot.service;


import com.neusoft.elmboot.ElmBootApplication;
import com.neusoft.elmboot.TestUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

import static com.neusoft.elmboot.TestUtil.testSingle;

@SpringBootTest(classes = ElmBootApplication.class)
@RunWith(SpringRunner.class)
@Transactional
public class BusinessServiceTest {
    @Autowired
    private BusinessService bS;


    @Test
    public void testListBusiness() {
        TestUtil.testList(new ArrayList<>(bS.listBusiness()), false);
    }

    @Test
    public void testListBusinessByOrderTypeId() {
        int[] orderTypeIds = {1, 4, 0};
        boolean[] ifNulls = {false, false, true};
        for (int i = 0; i < ifNulls.length; i++) {
            TestUtil.testList(new ArrayList<>(bS.listBusinessByOrderTypeId(orderTypeIds[i])), ifNulls[i]);
        }
    }


    @Test
    public void testGetBusinessById() {
        testSingle(bS.getBusinessById(10001), false);

        testSingle(bS.getBusinessById(0), true);
    }


}
