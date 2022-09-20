package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.bo.BusinessBo;
import com.neusoft.elmboot.po.Business;
import com.neusoft.elmboot.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/BusinessController")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @RequestMapping("/listBusinessByOrderTypeId")
    public List<BusinessBo> listBusinessByOrderTypeId(Business business) throws Exception {
        return businessService.listBusinessByOrderTypeId(business.getOrderTypeId());
    }

    @RequestMapping("/listBusiness")
    public List<BusinessBo> listBusiness() {
        return businessService.listBusiness();
    }

    @RequestMapping("/getBusinessById")
    public BusinessBo getBusinessById(Business business) throws Exception {
        return businessService.getBusinessById(business.getBusinessId());
    }
}