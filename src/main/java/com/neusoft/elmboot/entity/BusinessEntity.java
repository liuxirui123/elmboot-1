package com.neusoft.elmboot.entity;


import com.neusoft.elmboot.po.Business;

public class BusinessEntity extends Business {

    private Integer businessId;

    @Override
    public String toString() {
        return "BusinessEntity{" +
                "businessId='" + businessId + "', " +
                super.toString() +
                '}';
    }
}