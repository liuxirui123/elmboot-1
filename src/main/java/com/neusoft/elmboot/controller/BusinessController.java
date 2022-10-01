package com.neusoft.elmboot.controller;

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
    public List<Business> listBusinessByOrderTypeId(Integer orderTypeId) {
        return businessService.listBusinessByOrderTypeId(orderTypeId);
    }

    @RequestMapping("/listBusiness")
    public List<Business> listBusiness() {
        return businessService.listBusiness();
    }

    @RequestMapping("listRandomBusiness")
    public List<Business> listRandomBusiness() {//获得随机的5个商家
        return businessService.listRandomBusiness();

    }

    @RequestMapping("/getBusinessById")
    public Business getBusinessById(Integer businessId) {
        return businessService.getBusinessById(businessId);
    }
}