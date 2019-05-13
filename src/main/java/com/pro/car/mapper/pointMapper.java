package com.pro.car.mapper;

import com.pro.car.bean.point;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface pointMapper {
    @Select("select * from point where partname = #{name}")
    public ArrayList<point> findpoint(String name);
    @Insert("insert into point values(#{flag},#{partname},#{x},#{y})")
    public void insertPoint(point p);
}
