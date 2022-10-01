package com.neusoft.elmboot.service.impl;


import com.neusoft.elmboot.mapper.CartMapper;
import com.neusoft.elmboot.po.Cart;
import com.neusoft.elmboot.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;


    @Override
    public List<Cart> listCart(Cart c) {
        return cartMapper.listCart(c);
    }

    @Override
    public int saveCart(Cart c) {
        return cartMapper.saveCart(c);
    }

    @Override
    public int updateCart(Cart c) {
        return cartMapper.updateCart(c);
    }

    @Override
    public int removeCart(Cart c) {
        return cartMapper.removeCart(c);
    }


}
