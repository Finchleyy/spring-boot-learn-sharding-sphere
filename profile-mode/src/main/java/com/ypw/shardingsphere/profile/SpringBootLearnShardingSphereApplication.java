package com.ypw.shardingsphere.profile;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ypw.shardingsphere.profile.mapper")
public class SpringBootLearnShardingSphereApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearnShardingSphereApplication.class, args);
    }

}
