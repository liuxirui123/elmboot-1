package com.neusoft.elmboot.mapper;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserMapperTest {
    @Autowired
    private UserMapper uM;

//    @Test
//    public void testGetUserByIdByPass() {
//        UserEntity u = new UserEntity("12345678910", "123");
//        u = uM.getUserByIdByPass(u);
//        Assert.assertNotNull(u);
//        System.out.println(u);
//    }
//
//    @Test
//    public void testGetUserById() {
//        int u = uM.getUserById("12345678910");
//        Assert.assertTrue(u != 0);
//        System.out.println(u);
//    }
//
//    @Test
//    public void testSaveUser() {
//        UserEntity u = new UserEntity("22345678910", "123", "林志玲", 2);
//
//        int result = uM.saveUser(u);
//        Assert.assertTrue(result > 0);
//        System.out.println(result);
//    }
}
