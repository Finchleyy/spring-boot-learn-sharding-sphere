package com.ypw.shardingsphere.profile.service.impl;

import com.ypw.shardingsphere.profile.entity.Order;
import com.ypw.shardingsphere.profile.mapper.OrderMapper;
import com.ypw.shardingsphere.profile.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yupengwu
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;


    @Override
    public String saveOrder(Order order) {
        //int result = orderMapper.insert(order);
        int i = orderMapper.insertSelective(order);
        return order.getOrderId().toString();
    }
}
