package com.neusoft.elmboot.service;

import com.neusoft.elmboot.ElmBootApplication;
import com.neusoft.elmboot.TestUtil;
import com.neusoft.elmboot.po.Cart;
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
public class CartServiceTest {

    @Autowired
    private CartService cS;

    @Test
    public void testListCart() {//TODO 查询商家Id=0时，等效于为空
        String userId = "11111111111";
        Integer[] businessIds = {10001, 1, 10001, 1, -1};
        String[] userIds = {userId, userId, "test", "test", userId};
        boolean[] ifNulls = {false, true, true, true,true};

        for (int i = 0; i < ifNulls.length; i++) {
            TestUtil.testGetList(new ArrayList<>(cS.listCart(new Cart(businessIds[i], userIds[i]))), ifNulls[i]);
        }
    }


    @Test
    public void testSaveCart() {

    }


}
