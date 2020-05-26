package com.ypw.shardingsphere.manual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//要排掉 DataSource 自动装配,否则会循环引用
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootLearnShardingSphereApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearnShardingSphereApplication.class, args);
    }

}
