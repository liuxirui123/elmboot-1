package com.neusoft.elmboot.po;


public class Cart {

    private Integer cartId;
    private Integer foodId;
    private Integer businessId;
    private String userId;
    private Integer quantity;

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", foodId=" + foodId +
                ", businessId=" + businessId +
                ", userId='" + userId + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public Cart(Integer businessId, String userId) {
        this.businessId = businessId;
        this.userId = userId;
    }

    public Cart(Integer businessId, Integer foodId, String userId) {
        this(businessId, userId);
        this.foodId = foodId;
    }

    public Cart(Integer businessId, Integer foodId, String userId, Integer quantity) {
        this(businessId, foodId, userId);
        this.quantity = quantity;
    }

    public Cart(Integer cartId, Integer businessId, Integer foodId, String userId, Integer quantity) {
        this(businessId, foodId, userId, quantity);
        this.cartId = cartId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public String getUserId() {
        return userId;
    }

    public Integer getQuantity() {
        return quantity;
    }
}