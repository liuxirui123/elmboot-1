package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Cart;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CartMapper {

    List<Cart> listCart(Cart cart);

    @Insert("insert into cart values(null,#{foodId},#{businessId},#{userId},1)")
    int saveCart(Cart cart);

    @Update("update cart set quantity=#{quantity} where foodId=#{foodId} and businessId=#{businessId} and userId=#{userId}")
    int updateCart(Cart cart);

    int removeCart(Cart cart);//删除单个食品的购物车


}