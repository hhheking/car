package com.pro.car.mapper;

import com.pro.car.bean.parting;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PartingMapper {
    @Select("select * from parting where name = #{name}")
    public parting findpart(String name);
    @Insert("insert into parting(partname,x,y,name,time) values(#{partname},#{x},#{y},#{name},#{time})")
    public void insertPart(parting part);
}
