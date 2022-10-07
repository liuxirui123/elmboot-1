package com.neusoft.elmboot.po;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter//自动加getter方法
@Setter//自动加setter方法
@AllArgsConstructor//所有字段的构造函数
@NoArgsConstructor//无参构造
public abstract class Business {

    protected String businessName;
    protected String businessAddress;
    protected String businessExplain;
    protected String businessImg;
    protected Integer orderTypeId;
    protected double starPrice; //起送费
    protected double deliveryPrice; //配送费
    protected String remarks;


    @Override
    public String toString() {
        return "Business{" +
                "businessName='" + businessName + '\'' +
                ", businessAddress='" + businessAddress + '\'' +
                ", businessExplain='" + businessExplain + '\'' +
                ", businessImg" +
                ", orderTypeId=" + orderTypeId +
                ", starPrice=" + starPrice +
                ", deliveryPrice=" + deliveryPrice +
                ", remarks='" + remarks + '\'' +
                '}';
    }

}