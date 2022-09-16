package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.DataConnection;
import com.neusoft.elmboot.po.Business;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BusinessMapperTest {
	DataConnection dataCon = new DataConnection();
	SqlSession sqlSession = dataCon.getSqlSession();
	BusinessMapper bM = sqlSession.getMapper(BusinessMapper.class);
	
	@Test
	public void testGetBusinessById() {
		int[] bIds = {10001, 10002, 10003};
		int[] bIdsNot = {0, -2, 90};
		Business b;
		for (int bId : bIds) {
			b = bM.getBusinessById(bId);
			System.out.println(b);
			Assert.assertNotNull(b);
		}
		for (int bIdNot : bIdsNot) {
			b = bM.getBusinessById(bIdNot);
			System.out.println(b);
			Assert.assertNull(b);
		}
	}
	
	@Test
	public void testListBusinessByOrderTypeId() {
		List<Business> bList;
		bList = bM.listBusinessByOrderTypeId(1);
		System.out.println(String.valueOf(bList.size()) + bList);
		Assert.assertTrue(bList.size() > 0);
		
		bList = bM.listBusinessByOrderTypeId(0);
		System.out.println(String.valueOf(bList.size()) + bList);
		Assert.assertEquals(0, bList.size());
	}
}
