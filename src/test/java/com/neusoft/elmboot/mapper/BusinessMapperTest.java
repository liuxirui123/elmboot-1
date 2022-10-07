package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.TestUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class BusinessMapperTest {
    @Autowired
    BusinessMapper bM;

    @Test
    public void testGetBusinessById() {
        int[] bIds = {10001, 10002, 10003};
        int[] bIdsNot = {0, -2, 90};
        for (int id : bIds) {
            TestUtil.testGetSingle(bM.getBusinessById(id), false);
        }
        for (int id : bIdsNot) {
            TestUtil.testGetSingle(bM.getBusinessById(id), true);
        }
    }

    @Test
    public void testListBusinessByOrderTypeId() {
        int[] oIds = {1, 4, 5};
        int[] oIdsNot = {-1, -2, 10123};
        for (int id : oIds) {
            TestUtil.testGetList(new ArrayList<>(bM.listBusinessByOrderTypeId(id)), false);
        }
        for (int id : oIdsNot) {
            TestUtil.testGetList(new ArrayList<>(bM.listBusinessByOrderTypeId(id)), true);
        }
    }

    @Test
    public void testListBusiness() {
        TestUtil.testGetList(new ArrayList<>(bM.listBusiness()), false);

    }
}
