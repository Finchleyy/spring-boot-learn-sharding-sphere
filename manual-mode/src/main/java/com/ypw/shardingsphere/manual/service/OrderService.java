package com.ypw.shardingsphere.manual.service;


import com.ypw.shardingsphere.manual.entity.Order;

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
