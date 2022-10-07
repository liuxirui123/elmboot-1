package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.entity.CartEntity;
import com.neusoft.elmboot.po.Cart;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CartMapperTest {
    @Autowired
  private   CartMapper cM;

    @Test
    public void testListCart() {
        Cart c = new CartEntity(2, "11111111111");
        List<Cart> cList = cM.listCart(c);
        System.out.println(String.valueOf(cList.size()) + cList);
        Assert.assertTrue(cList.size() > 0);
    }

    @Test
    public void testRemoveCart() {
        Cart c = new CartEntity(10001, "11111111111");
        Assert.assertEquals(1, cM.removeCart(c));

        c = new CartEntity(10001, 2, "11111111111");
        Assert.assertEquals(1, cM.removeCart(c));

        c = new CartEntity(10001, "test");
        Assert.assertEquals(0, cM.removeCart(c));

    }

    @Test
    public void testSaveCart() {
        Cart c = new CartEntity(10001, 2, "11111111111");
        int result = cM.saveCart(c);
        System.out.println(result);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void testUpdateCart() {
        Cart c = new CartEntity(10001, 2, "11111111111", 2);
        Assert.assertEquals(1, cM.updateCart(c));

        c = new CartEntity(10001, 2, "test", 2);
        Assert.assertEquals(0, cM.updateCart(c));
    }
}
