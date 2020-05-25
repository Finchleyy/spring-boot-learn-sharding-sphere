package com.ypw.springbootlearnshardingsphere;


import com.ypw.springbootlearnshardingsphere.entity.Order;
import com.ypw.springbootlearnshardingsphere.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootLearnShardingSphereApplication.class)
public class SpringBootLearnShardingSphereApplicationTests {
    @Autowired
    OrderService orderService;

    @Test
    public void contextLoads() {
        for (int i = 0; i < 100; i++) {
            Order order = new Order();
            order.setName("订单 111");
            order.setUserId(1L);
            String s = orderService.saveOrder(order);
            System.out.println(s);
        }
    }


}
