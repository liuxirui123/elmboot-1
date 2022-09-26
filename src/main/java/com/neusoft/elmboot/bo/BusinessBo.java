package com.neusoft.elmboot.bo;


import com.neusoft.elmboot.po.Address;
import com.neusoft.elmboot.po.Business;

import java.util.Objects;


public class BusinessBo {


    private Integer businessId;
    private String businessName;
    private String businessExplain;
    private String businessImg;

    private double starPrice; //起送费
    private double deliveryPrice; //配送费

    private String remarks;

    private Address address;

    public BusinessBo() {

    }

    public BusinessBo(Business b) {
        this.businessId = b.getBusinessId();
        this.businessName = b.getBusinessName();
        this.businessExplain = b.getBusinessExplain();
        this.businessImg = b.getBusinessImg();
        this.starPrice = b.getStarPrice();
        this.deliveryPrice = b.getDeliveryPrice();
        this.remarks = b.getRemarks();
    }

    public BusinessBo(Business b, Address a) {
        this(b);
        this.address = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BusinessBo that = (BusinessBo) o;

        if (Double.compare(that.starPrice, starPrice) != 0) return false;
        if (Double.compare(that.deliveryPrice, deliveryPrice) != 0) return false;
        if (!Objects.equals(businessId, that.businessId)) return false;
        if (!Objects.equals(businessName, that.businessName)) return false;
        if (!Objects.equals(businessExplain, that.businessExplain))
            return false;
        if (!Objects.equals(businessImg, that.businessImg)) return false;
        if (!Objects.equals(remarks, that.remarks)) return false;
        return Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return businessId != null ? businessId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "BusinessBo{" +
                "businessId=" + businessId +
                ", businessName='" + businessName + '\'' +
                ", businessExplain='" + businessExplain + '\'' +
                ", starPrice=" + starPrice +
                ", deliveryPrice=" + deliveryPrice +
                ", remarks='" + remarks + '\'' +
                ", address=" + address +
                '}';
    }

    public void setAddress(Address a) {
        this.address = a;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessExplain() {
        return businessExplain;
    }

    public void setBusinessExplain(String businessExplain) {
        this.businessExplain = businessExplain;
    }

    public String getBusinessImg() {
        return businessImg;
    }

    public void setBusinessImg(String businessImg) {
        this.businessImg = businessImg;
    }

    public double getStarPrice() {
        return starPrice;
    }

    public void setStarPrice(double starPrice) {
        this.starPrice = starPrice;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Address getAddress() {
        return address;
    }
}