package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.TestUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

import static com.neusoft.elmboot.TestCases.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class BusinessMapperTest {
    @Autowired
    BusinessMapper bM;

    @Test
    public void testGetBusinessById() {
        for (int id : businessIds) {
            TestUtil.testGetSingle(bM.getBusinessById(id), false);
        }
        for (int id : businessIdsNOt) {
            TestUtil.testGetSingle(bM.getBusinessById(id), true);
        }
    }

    @Test
    public void testListBusinessByOrderTypeId() {
        for (int id : businessOrderTypeIds) {
            TestUtil.testGetList(bM.listBusinessByOrderTypeId(id), false);
        }
        for (int id : businessOrderTypeIdsNot) {
            TestUtil.testGetList(bM.listBusinessByOrderTypeId(id), true);
        }
    }

    @Test
    public void testListBusiness() {
        TestUtil.testGetList(new ArrayList<>(bM.listBusiness()), false);

    }
}
