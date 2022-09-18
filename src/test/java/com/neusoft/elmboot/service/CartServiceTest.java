package com.neusoft.elmboot.service;

import com.neusoft.elmboot.po.Cart;
import com.neusoft.elmboot.service.impl.CartServiceImpl;
import org.junit.Test;

public class CartServiceTest {
    private CartService cs = new CartServiceImpl();

    @Test
    public void testListCart() {
        Cart c = new Cart("11111111111");
        cs.listCart(c);
    }
}
