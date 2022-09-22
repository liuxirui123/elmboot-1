package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Address;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AddressMapper {
    @Select("select * from address where addressId=#{addressId}")
    Address getAddressById(Integer addressId);

    @Insert("insert into address values(null,#{longitudes},#{latitudes},#{addressExplain})")
    int saveAddress(Address addressPo);

    @Update("update address set longitudes=#{longitudes}, latitudes=#{latitudes}, addressExplain=#{addressExplain} where addressId=#{addressId}")
    int updateAddress(Address address);
}
