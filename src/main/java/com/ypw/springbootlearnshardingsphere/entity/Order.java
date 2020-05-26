package com.ypw.springbootlearnshardingsphere.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * (TOrder0)实体类
 *
 * @author makejava
 * @since 2020-05-25 15:29:35
 */
@Data
@Accessors(chain = true)
//@TableName("t_order")
public class Order implements Serializable {
    private static final long serialVersionUID = 573068993750125730L;

    private Long orderId;

    private Long userId;

    private String name;

}