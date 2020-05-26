package com.ypw.springbootlearnshardingsphere.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ypw.springbootlearnshardingsphere.entity.OrderItem;

public interface OrderItemMapper extends BaseMapper<OrderItem> {
    int deleteByPrimaryKey(Long orderId);

    //int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}
