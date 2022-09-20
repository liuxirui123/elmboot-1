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
}
