package com.neusoft.elmboot.entity;


import com.neusoft.elmboot.po.Cart;

public class CartEntity extends Cart {

    private Integer cartId;


    public CartEntity() {
    }

    public CartEntity(Integer businessId, String userId) {
        this.businessId = businessId;
        this.userId = userId;
    }

    public CartEntity(Integer foodId, Integer businessId, String userId) {
        this(businessId, userId);
        this.foodId = foodId;
    }

    public CartEntity(Integer foodId, Integer businessId, String userId, Integer cartId) {
        this(foodId, businessId, userId);
        this.cartId = cartId;
    }
}