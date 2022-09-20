package com.neusoft.elmboot.service;

import com.neusoft.elmboot.ElmBootApplication;
import com.neusoft.elmboot.bo.CartBo;
import com.neusoft.elmboot.po.Cart;
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
public class CartServiceTest {

    @Autowired
    private CartService cS;

    @Test
    public void testListCart() {
        Cart c = new Cart(1, "");
        List<CartBo> cBoList = cS.listCart(c);
    }


    @Test
    public void testSaveCart() {

    }
}
