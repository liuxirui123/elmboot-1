package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getUserByIdByPass(User user);

    int getUserById(String userId);


    int saveUser(User user);
}
