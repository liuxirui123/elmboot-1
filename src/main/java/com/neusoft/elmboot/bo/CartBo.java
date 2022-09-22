package com.neusoft.elmboot.bo;

import com.neusoft.elmboot.po.Cart;

public class CartBo {
    private Integer cartId;
    private String userId;
    private Integer quantity;

    private FoodBo foodBo;//多对一：所属食品

    private BusinessBo businessBo;//多对一：所属商家

    public CartBo() {
    }

    public CartBo(Cart c) {
        this.cartId = c.getCartId();
        this.userId = c.getUserId();
        this.quantity = c.getQuantity();
    }

    public CartBo(Cart c, FoodBo fB, BusinessBo bB) {
        this(c);
        this.foodBo = fB;
        this.businessBo = bB;
    }

    public CartBo(Integer cartId, String userId, Integer quantity, FoodBo fB, BusinessBo businessBo) {
        this.cartId = cartId;
        this.userId = userId;
        this.quantity = quantity;
        this.foodBo = fB;
        this.businessBo = businessBo;
    }

    @Override
    public String toString() {
        return "CartBo{" +
                "cartId=" + cartId +
                ", userId='" + userId + '\'' +
                ", quantity=" + quantity +
                ", food=" + foodBo +
                ", businessBo=" + businessBo +
                '}';
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public FoodBo getFoodBo() {
        return foodBo;
    }

    public void setFoodBo(FoodBo foodBo) {
        this.foodBo = foodBo;
    }

    public BusinessBo getBusinessBo() {
        return businessBo;
    }

    public void setBusinessBo(BusinessBo businessBo) {
        this.businessBo = businessBo;
    }
}
