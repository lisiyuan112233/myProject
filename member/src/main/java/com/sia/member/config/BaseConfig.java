package com.sia.member.config;


import com.sia.common.utils.User;
import com.sia.member.utils.UserContextUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {
    @Bean
    public UserContextUtil<User> getUserContextUtil() {
        return new UserContextUtil<>();
    }
}
