package com.neusoft.elmboot.po;

public class Food {
    private Integer foodId;
    private String foodName;
    private String foodExplain;
    private String foodImg;
    private Double foodPrice;
    private Integer businessId;
    private String remarks;

    public Food(Integer foodId, String foodName, String foodExplain, Double foodPrice, Integer businessId, String remarks) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodExplain = foodExplain;
        this.foodPrice = foodPrice;
        this.businessId = businessId;
        this.remarks = remarks;
    }

    public Integer getBusinessId() {
        return businessId;
    }
}