package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.po.Address;
import com.neusoft.elmboot.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/AddressController")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @RequestMapping("listAddress")
    public List<Address> listAddress() {
        return addressService.listAddress();
    }

}
