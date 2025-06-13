package com.sia.order;

import com.sia.order.config.DefaultFeignConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@MapperScan("com.sia.order.mapper")
@SpringBootApplication
@EnableFeignClients(value = "com.sia.api.client",defaultConfiguration = DefaultFeignConfig.class)
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}
