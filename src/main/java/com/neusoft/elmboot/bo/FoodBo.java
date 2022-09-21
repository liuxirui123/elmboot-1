package com.neusoft.elmboot.bo;

import com.neusoft.elmboot.po.Food;

public class FoodBo {
    private Integer foodId;
    private String foodName;
    private String foodExplain;
    private String foodImg;
    private Double foodPrice;
    private Integer businessId;
    private String remarks;

    public FoodBo(Food f) {
        this.foodId = f.getFoodId();
        this.foodName = f.getFoodName();
        this.foodExplain = f.getFoodExplain();
        this.foodImg = f.getFoodImg();
        this.foodPrice = f.getFoodPrice();
        this.businessId = f.getBusinessId();
        this.remarks = f.getRemarks();
    }
}
