package com.pro.car.mapper;

import com.pro.car.bean.userInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserInfoMapper {
    @Select("select * from userinfo where name = #{name}")
    public userInfo findInfo(String name);
    @Insert("insert into userinfo values(#{name},#{sex},#{phone},#{email},#{age})")
    public void InsertInfo(userInfo u);
    @Update("update userinfo set sex = #{sex},phone = #{phone},email = #{email},age = #{age} where name=#{name}")
    public void update_userinfo(userInfo u);
}
