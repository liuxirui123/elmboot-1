package com.neusoft.elmboot.bo;

import com.neusoft.elmboot.po.Address;
import com.neusoft.elmboot.po.DeliveryAddress;

public class DeliveryAddressBo {
    private Integer daId;
    private String userId;
    private String contactName;
    private Integer contactSex;
    private String contactTel;
    private Address address;

    public DeliveryAddressBo(DeliveryAddress da) {
        this.daId = da.getDaId();
        this.userId = da.getUserId();
        this.contactName = da.getContactName();
        this.contactSex = da.getContactSex();
        this.contactTel = da.getContactTel();
    }

    public DeliveryAddressBo(DeliveryAddress da, Address a) {
        this(da);
        this.address = a;
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

    public Address getAddress() {
        return new Address(address);
    }

    public Integer getDaId() {
        return daId;
    }

    public void setDaId(Integer daId) {
        this.daId = daId;
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

    public void setAddress(Address address) {
        this.address = address;
    }
}
