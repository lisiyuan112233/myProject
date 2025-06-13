package com.sia.order;

import com.sia.api.client.memberClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderApplicationTests {

    @Autowired
    private memberClient client;
    @Test
    void contextLoads() {
        System.out.println(client.getHello());
    }

}
