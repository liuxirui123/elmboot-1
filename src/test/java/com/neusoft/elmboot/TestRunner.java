package com.neusoft.elmboot;

import com.neusoft.elmboot.po.Business;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestRunner {
	public DataConnection dataCon = new DataConnection();
	
	@Test
	public void testGetSqlSession() {
		SqlSession sqlSession;
		sqlSession = dataCon.getSqlSession();
		Assert.assertNotNull(sqlSession);
	}
	
	@Test
	public void TestSelect() throws IOException {
		SqlSession sqlSession = dataCon.getSqlSession();//sqlSession.selectOne最终结果与映射文件中所匹配的resultType类型
		Business b = sqlSession.selectOne("com.neusoft.elmboot.mapper.BusinessMapper.getBusinessById", 10001);
		
		System.out.println(b);
		sqlSession.close();
	}
	
}
