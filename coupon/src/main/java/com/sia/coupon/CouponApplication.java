package com.sia.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@MapperScan("com.sia.coupon.mapper")
public class CouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(CouponApplication.class, args);
    }

}
