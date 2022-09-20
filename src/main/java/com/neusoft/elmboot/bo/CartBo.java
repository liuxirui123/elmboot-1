package com.neusoft.elmboot.bo;

import com.neusoft.elmboot.po.Cart;
import com.neusoft.elmboot.po.Food;

public class CartBo {
    private Integer cartId;
    private String userId;
    private Integer quantity;

    private Food food;//多对一：所属食品

    private BusinessBo businessBo;//多对一：所属商家

    public CartBo(Cart c) {
        this.cartId = c.getCartId();
        this.userId = c.getUserId();
        this.quantity = c.getQuantity();
    }

    public CartBo(Cart c, Food f, BusinessBo bB) {
        this(c);
        this.food = f;
        this.businessBo = bB;
    }

    public CartBo(Integer cartId, String userId, Integer quantity, Food food, BusinessBo businessBo) {
        this.cartId = cartId;
        this.userId = userId;
        this.quantity = quantity;
        this.food = food;
        this.businessBo = businessBo;
    }
}
