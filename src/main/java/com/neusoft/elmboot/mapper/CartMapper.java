package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Cart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {
    List<Cart> listCart(Cart cart);

    int saveCart(Cart cart);

    int updateCart(Cart cart);

    int removeCart(Cart cart);
}