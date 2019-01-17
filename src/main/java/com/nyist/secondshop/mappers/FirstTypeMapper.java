package com.nyist.secondshop.mappers;

import com.nyist.secondshop.models.FirstType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by chao on 2018/4/17.
 */
public interface FirstTypeMapper {
    @Select("select * from first_type_table;")
    List<FirstType> getAllFirstType();

    @Select("select id from first_type_table ORDER BY id desc limit 0, 1;")
    Integer getFirstTypeLastId();

    @Insert("insert into first_type_table(id, name) values(#{id}, #{name});")
    int createFirstType(FirstType firstType);

    @Delete("delete from first_type_table where id = #{firstTypeId};")
    int deleteFirstType(Integer firstTypeId);
}
