package com.ypw.shardingsphere.profile.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ypw.shardingsphere.profile.entity.OrderItem;

public interface OrderItemMapper extends BaseMapper<OrderItem> {
    int deleteByPrimaryKey(Long orderId);

    //int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}
