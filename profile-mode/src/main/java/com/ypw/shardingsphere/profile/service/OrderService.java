package com.ypw.shardingsphere.profile.service;

import com.ypw.shardingsphere.profile.entity.Order;

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
