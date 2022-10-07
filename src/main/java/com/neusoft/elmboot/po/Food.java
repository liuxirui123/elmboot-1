package com.neusoft.elmboot.po;

import lombok.*;

@Getter//自动加getter方法
@Setter//自动加setter方法
@AllArgsConstructor//所有字段的构造函数
@NoArgsConstructor//无参构造
@ToString
public abstract class Food {

    private String foodName;
    private String foodExplain;
    private String foodImg;
    private Double foodPrice;
    private Integer businessId;
    private String remarks;

}