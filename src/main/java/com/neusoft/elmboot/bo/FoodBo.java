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

    public Integer getBusinessId() {
        return businessId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodExplain() {
        return foodExplain;
    }

    public void setFoodExplain(String foodExplain) {
        this.foodExplain = foodExplain;
    }

    public String getFoodImg() {
        return foodImg;
    }

    public void setFoodImg(String foodImg) {
        this.foodImg = foodImg;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
