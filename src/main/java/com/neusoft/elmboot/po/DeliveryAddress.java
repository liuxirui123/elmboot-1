package com.neusoft.elmboot.po;

import com.neusoft.elmboot.bo.DeliveryAddressBo;

public class DeliveryAddress {
    private Integer daId;
    private Integer addressId;
    private String userId;
    private String contactName;
    private Integer contactSex;
    private String contactTel;

    private Integer delTag;

    public DeliveryAddress() {

    }

    public DeliveryAddress(DeliveryAddressBo dABo) {
        this.addressId = dABo.getAddress().getAddressId();
        this.userId= dABo.getUserId();
        this.contactName=dABo.getContactName();
        this.contactSex=dABo.getContactSex();
        this.contactTel=dABo.getContactTel();
    }

    public DeliveryAddress(Integer addressId, String userId, String contactName, Integer contactSex, String contactTel) {
        this.addressId = addressId;
        this.userId = userId;
        this.contactName = contactName;
        this.contactSex = contactSex;
        this.contactTel = contactTel;
    }

    @Override
    public String toString() {
        return "DeliveryAddress{" +
                "daId=" + daId +
                ", addressId=" + addressId +
                ", userId='" + userId + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactSex=" + contactSex +
                ", contactTel='" + contactTel + '\'' +
                ", delTag=" + delTag +
                '}';
    }

    public Integer getDaId() {
        return daId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public String getUserId() {
        return userId;
    }

    public String getContactName() {
        return contactName;
    }

    public Integer getContactSex() {
        return contactSex;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setDaId(Integer daId) {
        this.daId = daId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactSex(Integer contactSex) {
        this.contactSex = contactSex;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public void setDelTag(Integer delTag) {
        this.delTag = delTag;
    }
}
