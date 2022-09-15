package com.neusoft.elmboot.service;

import com.neusoft.elmboot.po.Business;
import com.neusoft.elmboot.service.impl.BusinessServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BusinessServiceTest {
	private BusinessService bs = new BusinessServiceImpl();
	
	@Test
	public void testGetBusinessById() {
		Business b;
		for (int i = 10001; i <= 10009; i++) {
			b = bs.getBusinessById(i);
			Assert.assertNotNull(b);
			System.out.println(bs.getBusinessById(10001));
			
		}
	}
	
	@Test
	public void testListBusinessByOrderTypeId() {
		List<Business> bList;
		bList = bs.listBusinessByOrderTypeId(1);
		Assert.assertNotNull(bList);
		System.out.println(bList);
	}
}
