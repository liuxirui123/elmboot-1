package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.MyBatisUtil;
import com.neusoft.elmboot.po.Cart;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CartMapperTest {
    SqlSession sqlSession = MyBatisUtil.getSqlSession();
    CartMapper cM = sqlSession.getMapper(CartMapper.class);

    @Test
    public void testListCart() {
        Cart c = new Cart("11111111111", 10001, 2);
        List<Cart> cList = cM.listCart(c);
        System.out.println(String.valueOf(cList.size()) + cList);
        Assert.assertTrue(cList.size() > 0);
    }

    @Test
    public void testRemoveCart() {
        Cart c = new Cart("11111111111", 10001);
        Assert.assertEquals(1, cM.removeCart(c));
        sqlSession.rollback();

        c = new Cart("11111111111", 10001, 2);
        Assert.assertEquals(1, cM.removeCart(c));
        sqlSession.rollback();

        c = new Cart("test", 10001);
        Assert.assertEquals(0, cM.removeCart(c));
        sqlSession.rollback();

    }

    @Test
    public void testSaveCart() {
        Cart c = new Cart("test", 10001, 1);
        int result = cM.saveCart(c);
        System.out.println(result);
        Assert.assertTrue(result > 0);
        sqlSession.rollback();
    }

    @Test
    public void testUpdateCart() {
        Cart c = new Cart("11111111111", 10001, 2, 2);
        Assert.assertEquals(1, cM.updateCart(c));
        sqlSession.rollback();

        c = new Cart("test", 10001, 2, 2);
        Assert.assertEquals(0, cM.updateCart(c));
        sqlSession.rollback();
    }
}
