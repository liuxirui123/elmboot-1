package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.bo.DeliveryAddressBo;
import com.neusoft.elmboot.po.Address;
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
    public List<DeliveryAddressBo> listDeliveryAddressByUserId(String userId) {
        return deliveryAddressService.listDeliveryAddressByUserId(userId);
    }

    @RequestMapping("/getDeliveryAddressById")
    public DeliveryAddressBo getDeliveryAddressById(Integer daId) {
        return deliveryAddressService.getDeliveryAddressById(daId);
    }

    @RequestMapping("/saveDeliveryAddress")
    public int saveDeliveryAddress(DeliveryAddress dA) {
        return deliveryAddressService.saveDeliveryAddress(dA);
    }

    @RequestMapping("/updateDeliveryAddress")
    public int updateDeliveryAddress(DeliveryAddressBo dABo) {
        return deliveryAddressService.updateDeliveryAddress(dABo);
    }

    @RequestMapping("/removeDeliveryAddress")
    public int removeDeliveryAddress(DeliveryAddress dA) {
        return deliveryAddressService.removeDeliveryAddress(dA.getDaId());

    }
}
