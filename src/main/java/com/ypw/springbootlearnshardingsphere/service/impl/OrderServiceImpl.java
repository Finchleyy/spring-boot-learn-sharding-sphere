package com.ypw.springbootlearnshardingsphere.service.impl;

import com.ypw.springbootlearnshardingsphere.entity.Order;
import com.ypw.springbootlearnshardingsphere.mapper.OrderMapper;
import com.ypw.springbootlearnshardingsphere.service.OrderService;
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
        int result = orderMapper.insert(order);
        return result + "";
    }
}
