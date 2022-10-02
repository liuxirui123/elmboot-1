package com.neusoft.elmboot.bo;

import com.neusoft.elmboot.po.Orders;

import java.util.List;

public class OrdersBo extends Orders {

    private BusinessBo businessBo;//多对一：所属商家
    private DeliveryAddressBo daBo;
    private List<OrderDetailBo> odBoList;//一对多：订单明细

}