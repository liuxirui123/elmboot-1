package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.bo.DeliveryAddressBo;
import com.neusoft.elmboot.mapper.AddressMapper;
import com.neusoft.elmboot.mapper.DeliveryAddressMapper;
import com.neusoft.elmboot.po.Address;
import com.neusoft.elmboot.po.DeliveryAddress;
import com.neusoft.elmboot.service.DeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeliveryAddressServiceImpl implements DeliveryAddressService {

    @Autowired
    private DeliveryAddressMapper deliveryAddressMapper;

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<DeliveryAddressBo> listDeliveryAddressByUserId(String userId) {
        return PoToPo(deliveryAddressMapper.listDeliveryAddressByUserId(userId));
    }

    @Override
    public DeliveryAddressBo getDeliveryAddressById(Integer daId) {
        return PoToBo(deliveryAddressMapper.getDeliveryAddressById(daId));
    }

    @Override
    @Transactional
    public int saveDeliveryAddress(DeliveryAddress dA) {

        return deliveryAddressMapper.saveDeliveryAddress(dA);
    }

    @Override
    public int updateDeliveryAddress(DeliveryAddressBo dABo) {
        addressMapper.updateAddress(new Address(dABo.getAddress()));
        return deliveryAddressMapper.updateDeliveryAddress(new DeliveryAddress(dABo));
    }

    @Override
    public int removeDeliveryAddress(Integer daId) {
        return deliveryAddressMapper.removeDeliveryAddress(daId);
    }

    private DeliveryAddressBo PoToBo(DeliveryAddress da) {
        return new DeliveryAddressBo(da, addressMapper.getAddressById(da.getAddressId()));
    }

    private List<DeliveryAddressBo> PoToPo(List<DeliveryAddress> daList) {
        List<DeliveryAddressBo> daBoList = new ArrayList<>();
        for (DeliveryAddress da : daList) {
            daBoList.add(PoToBo(da));
        }
        return daBoList;
    }
}
