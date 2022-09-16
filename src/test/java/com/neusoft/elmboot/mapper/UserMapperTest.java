package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.MyBatisUtil;
import com.neusoft.elmboot.po.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

public class UserMapperTest {
    SqlSession sqlSession = MyBatisUtil.getSqlSession();
    UserMapper uM = sqlSession.getMapper(UserMapper.class);

    @Test
    public void testGetUserByIdByPass() {
        User u = new User("12345678910", "123");
        u = uM.getUserByIdByPass(u);
        Assert.assertNotNull(u);
        System.out.println(u);
    }

    @Test
    public void testGetUserById() {
        int u = uM.getUserById("12345678910");
        Assert.assertTrue(u != 0);
        System.out.println(u);
    }

    @Test
    public void testSaveUser() {
        User u = new User("22345678910", "123", "林志玲",2);

        int result = uM.saveUser(u);
        Assert.assertTrue(result > 0);
        System.out.println(result);
    }
}
