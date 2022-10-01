package com.neusoft.elmboot.bo;

import com.neusoft.elmboot.po.Cart;

public class CartBo extends Cart {


    private FoodBo foodBo;//多对一：所属食品

    private BusinessBo businessBo;//多对一：所属商家

}
