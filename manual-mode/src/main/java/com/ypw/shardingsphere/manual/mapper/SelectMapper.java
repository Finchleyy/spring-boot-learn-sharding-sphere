package com.ypw.shardingsphere.manual.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SelectMapper {
    @Select("select * from t_order tor left join t_order_item toi on tor.order_id  = toi.order_id where tor.order_id = #{orderId}")
    List<Object> selectByOrderId(@Param("orderId") Long orderId);

    @Select("select * from t_order tor left join t_order_item toi on tor.order_id  = toi.order_id where tor.order_id = #{orderId} and tor.user_id=#{userId}")
    List<Object> selectByOrderIdAndUserId(@Param("orderId") Long orderId, @Param("userId") Long userId);
}
