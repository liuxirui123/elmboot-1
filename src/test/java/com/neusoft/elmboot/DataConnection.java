package com.neusoft.elmboot;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class DataConnection {
	private static final String resource = "mybatis-config.xml";
	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;
	
	public SqlSession getSqlSession()  {
		InputStream inputStream = null;//创建会话工厂，传入MyBatis配置文件信息
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession();
		return sqlSession;
	}
}
