package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.bo.BusinessBo;
import com.neusoft.elmboot.mapper.AddressMapper;
import com.neusoft.elmboot.mapper.BusinessMapper;
import com.neusoft.elmboot.po.Business;
import com.neusoft.elmboot.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessMapper businessMapper;

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<BusinessBo> listBusiness() {
        return PoToBo(businessMapper.listBusiness());
    }

    @Override
    public List<BusinessBo> listRandomBusiness() {
        return listRandom5(PoToBo(businessMapper.listBusiness()));
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

    private List<BusinessBo> listRandom5(List<BusinessBo> list) {
        if (list.size() < 5) {
            return null;
        } else if (list.size() == 5) {
            return list;
        }

        Random r = new Random();
        Set<BusinessBo> res = new HashSet<>();
        while (res.size() < 5) {
            res.add(
                    list.get(
                            r.nextInt(
                                    list.size())));
        }
        return new ArrayList<>(res);
    }


}
