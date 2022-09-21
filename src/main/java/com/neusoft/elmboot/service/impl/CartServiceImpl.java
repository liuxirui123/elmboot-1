package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.bo.BusinessBo;
import com.neusoft.elmboot.bo.CartBo;
import com.neusoft.elmboot.bo.FoodBo;
import com.neusoft.elmboot.mapper.AddressMapper;
import com.neusoft.elmboot.mapper.BusinessMapper;
import com.neusoft.elmboot.mapper.CartMapper;
import com.neusoft.elmboot.mapper.FoodMapper;
import com.neusoft.elmboot.po.Business;
import com.neusoft.elmboot.po.Cart;
import com.neusoft.elmboot.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;

    @Autowired
    private FoodMapper foodMapper;

    @Autowired
    private BusinessMapper businessMapper;

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<CartBo> listCart(Cart c) {
        return PoToBo(cartMapper.listCart(c));
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

    private CartBo PoToBo(Cart c) {
        if (c == null) {
            return null;
        }
        Business b = businessMapper.getBusinessById(c.getBusinessId());
        BusinessBo bB = new BusinessBo(b, addressMapper.getAddressById(b.getAddressId()));
        FoodBo fB =new FoodBo(foodMapper.getFoodById(c.getFoodId())) ;
        return new CartBo(c, fB, bB);
    }

    private List<CartBo> PoToBo(List<Cart> cList) {
        List<CartBo> cBoList = new ArrayList<>();
        for (Cart c : cList) {
            cBoList.add(PoToBo(c));
        }
        return cBoList;
    }
}
