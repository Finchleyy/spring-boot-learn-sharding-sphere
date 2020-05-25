package com.ypw.springbootlearnshardingsphere.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (TOrderItem0)实体类
 *
 * @author makejava
 * @since 2020-05-25 15:29:45
 */
@Data
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 387240767721952354L;

    private Long orderId;

    private String item;

    private Long userId;

}