package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.MyBatisUtil;
import com.neusoft.elmboot.po.Address;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;


public class AddressMapperTest {
    SqlSession sqlSession = MyBatisUtil.getSqlSession();
    AddressMapper aM = sqlSession.getMapper(AddressMapper.class);

    @Test
    public void testGetAddressById() {
        Address a = aM.getAddressById(1);
        Assert.assertNotNull(a);
        System.out.println(a);

        a = aM.getAddressById(0);
        Assert.assertNull(a);
    }

    @Test
    public void testSaveAddress() {
        Address a = new Address(0, 0, "test");
        Assert.assertEquals(1, aM.saveAddress(a));
        sqlSession.rollback();

        a = new Address(0, 0);
        Assert.assertEquals(1, aM.saveAddress(a));
        sqlSession.rollback();

    }
}
