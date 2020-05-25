package com.ypw.springbootlearnshardingsphere.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (TConfig)实体类
 *
 * @author makejava
 * @since 2020-05-25 15:29:21
 */
@Data
public class Config implements Serializable {
    private static final long serialVersionUID = 414620616823001987L;

    private Integer id;

    private Long userId;

    private String config;

}