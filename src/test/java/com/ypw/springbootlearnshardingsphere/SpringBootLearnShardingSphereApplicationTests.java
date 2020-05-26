package com.ypw.springbootlearnshardingsphere;


import com.ypw.springbootlearnshardingsphere.entity.Order;
import com.ypw.springbootlearnshardingsphere.entity.OrderItem;
import com.ypw.springbootlearnshardingsphere.mapper.OrderItemMapper;
import com.ypw.springbootlearnshardingsphere.mapper.SelectMapper;
import com.ypw.springbootlearnshardingsphere.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootLearnShardingSphereApplication.class)
public class SpringBootLearnShardingSphereApplicationTests {
    @Autowired
    OrderService orderService;
    @Autowired
    OrderItemMapper orderItemMapper;
    @Autowired
    SelectMapper selectMapper;

    @Test
    public void contextLoads() {
        for (int i = 10101; i < 10200; i++) {
            Order order = new Order().setName("订单" + i).setUserId((long) i);
            orderService.saveOrder(order);
            System.out.println(order.getOrderId());
            OrderItem orderItem = new OrderItem().setItem("商品" + i).setOrderId(order.getOrderId()).setUserId(order.getUserId());
            orderItemMapper.insertSelective(orderItem);


        }
    }

    @Test
    public void selectTest() {
        List<Object> objects = selectMapper.selectMultipart(10000L);
        System.out.println(objects);
    }
}
