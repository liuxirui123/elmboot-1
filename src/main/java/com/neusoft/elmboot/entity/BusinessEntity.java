package com.neusoft.elmboot.entity;


import com.neusoft.elmboot.po.Business;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class BusinessEntity extends Business {

    private Integer businessId;

    public BusinessEntity(Integer businessId, String businessName, String businessAddress, String businessExplain, String businessImg, Integer orderTypeId, double starPrice, double deliveryPrice, String remarks) {
        super(businessName, businessAddress, businessExplain, businessImg, orderTypeId, starPrice, deliveryPrice, remarks);
        this.businessId = businessId;
    }

    @Override
    public String toString() {
        return "BusinessEntity{" +
                "businessId='" + businessId + "', " +
                super.toString() +
                '}';
    }

}