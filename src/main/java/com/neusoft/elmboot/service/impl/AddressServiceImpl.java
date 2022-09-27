package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.mapper.AddressMapper;
import com.neusoft.elmboot.po.Address;
import com.neusoft.elmboot.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> listAddress() {
        return addressMapper.listAddress();
    }
}
