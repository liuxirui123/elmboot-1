package com.neusoft.elmboot.service.impl;


import com.neusoft.elmboot.bo.BusinessBo;
import com.neusoft.elmboot.mapper.BusinessMapper;
import com.neusoft.elmboot.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import static com.neusoft.elmboot.util.ModelConverterUtils.convert;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessMapper bM;


    @Override
    public List<BusinessBo> listBusiness() {
        return convert(bM.listBusiness(), BusinessBo.class);
    }

    @Override
    public List<BusinessBo> listRandomBusiness() {
        return listRandom5(convert(listBusiness(), BusinessBo.class));
    }

    @Override
    public List<BusinessBo> listBusinessByOrderTypeId(Integer orderTypeId) {
        return convert(bM.listBusinessByOrderTypeId(orderTypeId), BusinessBo.class);
    }

    @Override
    public BusinessBo getBusinessById(Integer businessId) {
        return convert(bM.getBusinessById(businessId), BusinessBo.class);
    }


    private List<BusinessBo> listRandom5(List<BusinessBo> list) {//从一个list中随机获取5个
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
