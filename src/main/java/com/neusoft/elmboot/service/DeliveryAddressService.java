package com.neusoft.elmboot.service;

import com.neusoft.elmboot.bo.DeliveryAddressBo;
import com.neusoft.elmboot.po.DeliveryAddress;

import java.util.List;

public interface DeliveryAddressService {
    List<DeliveryAddressBo> listDeliveryAddressByUserId(String userId);

    DeliveryAddressBo getDeliveryAddressById(Integer daId);

    int saveDeliveryAddress(DeliveryAddressBo deliveryAddress);

    int updateDeliveryAddress(DeliveryAddressBo deliveryAddress);

    int removeDeliveryAddress(Integer daId);
}
