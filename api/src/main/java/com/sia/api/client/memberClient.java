package com.sia.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("member-server")
public interface memberClient {
    @GetMapping("/member/hello")
    String getHello();
}
