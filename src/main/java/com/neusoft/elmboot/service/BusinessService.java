package com.neusoft.elmboot.service;

import com.neusoft.elmboot.bo.BusinessBo;

import java.util.List;

public interface BusinessService {

    List<BusinessBo> listBusiness();

    List<BusinessBo> listRandomBusiness();
    List<BusinessBo> listBusinessByOrderTypeId(Integer orderTypeId);

    BusinessBo getBusinessById(Integer businessId);

}
