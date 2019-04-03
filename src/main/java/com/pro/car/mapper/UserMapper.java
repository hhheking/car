package com.pro.car.mapper;

import com.pro.car.bean.Userid;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    public Userid findUser(Integer id);
}
