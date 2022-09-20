package com.neusoft.elmboot.service;


import com.neusoft.elmboot.ElmBootApplication;
import com.neusoft.elmboot.bo.BusinessBo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest(classes = ElmBootApplication.class)
@RunWith(SpringRunner.class)
@Transactional
public class BusinessServiceTest {
    @Autowired
    private BusinessService bS;


    @Test
    public void testListBusiness() {
        List<BusinessBo> bBoList = bS.listBusiness();
        testList(bBoList,false);
    }

    @Test
    public void testListBusinessByOrderTypeId() {
        List<BusinessBo> bBoList = bS.listBusinessByOrderTypeId(1);
        testList(bBoList,false);

        bBoList=bS.listBusinessByOrderTypeId(0);
        testList(bBoList,true);
    }

    @Test
    public void testGetBusinessById() {
        BusinessBo bBo;
        bBo = bS.getBusinessById(10001);
        testSingle(bBo, false);

        bBo = bS.getBusinessById(0);
        testSingle(bBo, true);
    }


    private void testSingle(BusinessBo bBo, boolean ifNull) {
        if (ifNull) {
            Assert.assertNull(bBo);
        } else {
            System.out.println(bBo);
            Assert.assertNotNull(bBo);
        }
    }

    private void testList(List<BusinessBo> bBoList,boolean ifNull) {
        if(ifNull){
            Assert.assertEquals(0, bBoList.size());
        }
        else{
            System.out.println(bBoList.size());
            Assert.assertTrue(bBoList.size() > 0);
            for (BusinessBo bBo : bBoList) {
                testSingle(bBo, false);
            }
        }
    }
}
