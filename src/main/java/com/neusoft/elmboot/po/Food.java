package com.neusoft.elmboot.po;

public class Food {
    private Integer foodId;
    private String foodName;
    private String foodExplain;
    private String foodImg;
    private Double foodPrice;
    private Integer businessId;
    private String remarks;

    @Override
    public String toString() {
        return "Food{" +
                "foodId=" + foodId +
                ", foodName='" + foodName + '\'' +
                ", foodExplain='" + foodExplain + '\'' +
                ", foodPrice=" + foodPrice +
                ", businessId=" + businessId +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public Integer getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodExplain() {
        return foodExplain;
    }

    public String getFoodImg() {
        return foodImg;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public String getRemarks() {
        return remarks;
    }
}