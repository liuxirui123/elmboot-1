package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.MyBatisUtil;
import com.neusoft.elmboot.po.OrderDetail;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailMapperTest {
    SqlSession sqlSession = MyBatisUtil.getSqlSession();
    OrderDetailMapper oDM = sqlSession.getMapper(OrderDetailMapper.class);

    @Test
    public void testSaveOrderDetailBatch() {
        List<OrderDetail> odList = new ArrayList<>();
        odList.add(new OrderDetail(1, 1, 1));
        Assert.assertEquals(1, oDM.saveOrderDetailBatch(odList));

        sqlSession.rollback();
    }

    @Test
    public void testListOrderDetailByOrderId() {
        Assert.assertEquals(0, oDM.listOrderDetailByOrderId(0).size());
    }


}
