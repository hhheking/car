package com.pro.car.mapper;

import com.pro.car.bean.Userid;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where name = #{name}")
    public Userid findUser(String name);
    @Insert("insert into user(name,password) values(#{name},#{password})")
    public void insertUser(Userid user);
}
