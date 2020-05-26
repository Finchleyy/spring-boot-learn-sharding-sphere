package com.ypw.springbootlearnshardingsphere.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SelectMapper {
    @Select("select * from t_order tor left join t_order_item toi on tor.order_id  = toi.order_id where tor.user_id = #{userId}")
    List<Object> selectMultipart(@Param("userId") Long userId);
}
