package com.ypw.springbootlearnshardingsphere.service;

import com.ypw.springbootlearnshardingsphere.entity.Order;

/**
 * @author yupengwu
 */
public interface OrderService {
    /**
     * 保存
     *
     * @param order
     * @return
     */
    String saveOrder(Order order);
}
