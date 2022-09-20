package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.bo.BusinessBo;
import com.neusoft.elmboot.mapper.AddressMapper;
import com.neusoft.elmboot.mapper.BusinessMapper;
import com.neusoft.elmboot.po.Business;
import com.neusoft.elmboot.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessMapper businessMapper;

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<BusinessBo> listBusiness() {
        List<Business> bList = businessMapper.listBusiness();
        return PoToBo(bList);
    }

    @Override
    public List<BusinessBo> listBusinessByOrderTypeId(Integer orderTypeId) {
        List<Business> bList = businessMapper.listBusinessByOrderTypeId(orderTypeId);
        return PoToBo(bList);
    }

    @Override
    public BusinessBo getBusinessById(Integer businessId) {
        return PoToBo(businessMapper.getBusinessById(businessId));
    }

    private BusinessBo PoToBo(Business b) {
        if (b == null) {
            return null;
        }
        return new BusinessBo(
                b, addressMapper.getAddressById(b.getAddressId()));
    }

    private List<BusinessBo> PoToBo(List<Business> bList) {
        List<BusinessBo> bBoList = new ArrayList<>();
        for (Business b : bList) {
            bBoList.add(PoToBo(b));
        }
        return bBoList;
    }

}
