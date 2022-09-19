package com.neusoft.elmboot.po;


public class Business {


    private Integer businessId;
    private Integer addressId;
    private Integer orderTypeId;

    private String businessName;
    private String businessExplain;
    private String businessImg;

    private double starPrice; //起送费
    private double deliveryPrice; //配送费

    private String remarks;


    public Business() {

    }

    public Business(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public Integer getOrderTypeId() {
        return orderTypeId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getBusinessExplain() {
        return businessExplain;
    }

    public String getBusinessImg() {
        return businessImg;
    }

    public double getStarPrice() {
        return starPrice;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public String getRemarks() {
        return remarks;
    }
}