package com.neusoft.elmboot.bo;


import com.neusoft.elmboot.po.Address;
import com.neusoft.elmboot.po.Business;

public class BusinessBo {


    private Integer businessId;
    private String businessName;
    private String businessExplain;
    private String businessImg;

    private double starPrice; //起送费
    private double deliveryPrice; //配送费

    private String remarks;

    private Address address;


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


}