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

@SpringBootTest(classes = ElmBootApplication.class)
@RunWith(SpringRunner.class)
@Transactional
public class AddressServiceTest {

    @Autowired
    private AddressService aS;

    @Test
    public void testListAddress(){
        TestUtil.testGetList(new ArrayList<>(aS.listAddress()),false);
    }
}
