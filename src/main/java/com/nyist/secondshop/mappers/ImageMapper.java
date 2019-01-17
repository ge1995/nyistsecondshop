package com.nyist.secondshop.mappers;

import com.nyist.secondshop.models.Image;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by chao on 2018/4/27.
 */
public interface ImageMapper {
    @Select("select * from image_table where good_id = #{goodId};")
    List<Image> getImageByGoodId(Integer goodId);

    @Insert("insert into image_table(good_id, name, url) values(#{goodId}, #{name}, #{url});")
    int insertImage(Image image);

    @Delete("delete from image_table where good_id = #{goodId};")
    int deleteImage(Integer goodId);
}
