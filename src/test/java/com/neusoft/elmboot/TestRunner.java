package com.neusoft.elmboot;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

public class TestRunner {

    @Test
    public void testGetSqlSession() {
        SqlSession sqlSession;
        sqlSession = MyBatisUtil.getSqlSession();
        Assert.assertNotNull(sqlSession);
    }

    @Test
    public void TestSelect() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();//sqlSession.selectOne最终结果与映射文件中所匹配的resultType类型

        sqlSession.close();
    }

}
