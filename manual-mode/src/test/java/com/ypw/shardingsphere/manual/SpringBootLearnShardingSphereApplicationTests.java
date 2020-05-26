package com.ypw.shardingsphere.manual;


import com.ypw.shardingsphere.manual.entity.Order;
import com.ypw.shardingsphere.manual.entity.OrderItem;
import com.ypw.shardingsphere.manual.mapper.OrderItemMapper;
import com.ypw.shardingsphere.manual.mapper.SelectMapper;
import com.ypw.shardingsphere.manual.service.OrderService;
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
        for (int i = 20101; i < 20200; i++) {
            Order order = new Order().setName("订单" + i).setUserId((long) i);
            orderService.saveOrder(order);
            System.out.println(order.getOrderId());
            OrderItem orderItem = new OrderItem().setItem("商品" + i).setOrderId(order.getOrderId()).setUserId(order.getUserId());
            orderItemMapper.insertSelective(orderItem);


        }
    }

    @Test
    public void selectTest() {
        /*List<Object> objects = selectMapper.selectByOrderId(472055026806685696L);
        System.out.println(objects);*/

        List<Object> objects1 = selectMapper.selectByOrderIdAndUserId(472055026806685696L, 10102L);
        System.out.println(objects1);
    }
}
