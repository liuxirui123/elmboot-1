package com.neusoft.elmboot.po;


public class Cart {
	
	private Integer cartId;
	private Integer foodId;
	private Integer businessId;
	private String userId;
	private Integer quantity;
	
	private Food food;//多对一：所属食品
	
	private Business business;//多对一：所属商家
	
	public Cart(String userId) {
		this.userId = userId;
		
	}
	
	public Cart(String userId, Integer businessId) {
		this(userId);
		this.businessId = businessId;
	}
	
	public Cart(String userId, Integer businessId, Integer foodId) {
		this(userId, businessId);
		this.foodId = foodId;
	}
	
	
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	
	public Integer getFoodId() {
		return foodId;
	}
	
	
	public Integer getBusinessId() {
		return businessId;
	}
	
	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
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
	
	public void setFood(Food food) {
		this.food = food;
	}
	
	public void setBusiness(Business business) {
		this.business = business;
	}
}