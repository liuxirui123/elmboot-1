package com.neusoft.elmboot.service.impl;


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


    @Override
    public List<Business> listBusiness() {
        return businessMapper.listBusiness();
    }

    @Override
    public List<Business> listRandomBusiness() {
        return listRandom5(businessMapper.listBusiness());
    }

    @Override
    public List<Business> listBusinessByOrderTypeId(Integer orderTypeId) {
        return businessMapper.listBusinessByOrderTypeId(orderTypeId);
    }

    @Override
    public Business getBusinessById(Integer businessId) {
        return businessMapper.getBusinessById(businessId);
    }


    private List<Business> listRandom5(List<Business> list) {
        if (list.size() < 5) {
            return null;
        } else if (list.size() == 5) {
            return list;
        }

        Random r = new Random();
        Set<Business> res = new HashSet<>();
        while (res.size() < 5) {
            res.add(
                    list.get(
                            r.nextInt(
                                    list.size())));
        }
        return new ArrayList<>(res);
    }


}
