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

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public void setOrderTypeId(Integer orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public void setBusinessExplain(String businessExplain) {
        this.businessExplain = businessExplain;
    }

    public void setBusinessImg(String businessImg) {
        this.businessImg = businessImg;
    }

    public void setStarPrice(double starPrice) {
        this.starPrice = starPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}