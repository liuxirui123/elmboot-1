package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.bo.DeliveryAddressBo;
import com.neusoft.elmboot.entity.DeliveryAddressEntity;
import com.neusoft.elmboot.po.DeliveryAddress;
import com.neusoft.elmboot.service.DeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/DeliveryAddressController")
public class DeliveryAddressController {
    @Autowired
    private DeliveryAddressService deliveryAddressService;

    @RequestMapping("/listDeliveryAddressByUserId")
    public List<DeliveryAddress> listDeliveryAddressByUserId(String userId) {
        return deliveryAddressService.listDeliveryAddressByUserId(userId);
    }

    @RequestMapping("/getDeliveryAddressById")
    public DeliveryAddress getDeliveryAddressById(Integer daId) {
        return deliveryAddressService.getDeliveryAddressById(daId);
    }

    @RequestMapping("/saveDeliveryAddress")
    public int saveDeliveryAddress(DeliveryAddressEntity dA) {
        return deliveryAddressService.saveDeliveryAddress(dA);
    }

    @RequestMapping("/updateDeliveryAddress")
    public int updateDeliveryAddress(DeliveryAddressBo dABo) {
        return deliveryAddressService.updateDeliveryAddress(dABo);
    }

    @RequestMapping("/removeDeliveryAddress")
    public int removeDeliveryAddress(Integer daId) {
        return deliveryAddressService.removeDeliveryAddress(daId);

    }
}
