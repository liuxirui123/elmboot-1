package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.service.BusinessService;
import com.neusoft.elmboot.vo.BusinessVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.neusoft.elmboot.util.ModelConverterUtils.convert;

@RestController
@RequestMapping("/BusinessController")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @RequestMapping("/listBusinessByOrderTypeId")
    public List<BusinessVo> listBusinessByOrderTypeId(Integer orderTypeId) {
        return convert(businessService.listBusinessByOrderTypeId(orderTypeId), BusinessVo.class);
    }

    @RequestMapping("/listBusiness")
    public List<BusinessVo> listBusiness() {
        return convert(businessService.listBusiness(), BusinessVo.class);
    }

    @RequestMapping("listRandomBusiness")
    public List<BusinessVo> listRandomBusiness() {//获得随机的5个商家
        return convert(businessService.listRandomBusiness(), BusinessVo.class);
    }

    @RequestMapping("/getBusinessById")
    public BusinessVo getBusinessById(Integer businessId) {
        return convert(businessService.getBusinessById(businessId), BusinessVo.class);
    }
}