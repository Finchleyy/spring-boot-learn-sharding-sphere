package com.ypw.shardingsphere.profile.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ypw.shardingsphere.profile.entity.Order;

public interface OrderMapper extends BaseMapper<Order> {
    int deleteByPrimaryKey(Long orderId);

    //int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}
