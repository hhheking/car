package com.pro.car.mapper;

import com.pro.car.bean.part;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface partMapper {
    @Select("select * from part where partname = #{name}")
    public part findpart(String name);
}
