package com.springbootBasic.CRUD.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("EUREKA-SERVICE-CONNECTOR-2")
public interface Hello {

    @PostMapping("/getHello")
    public String getHello(@RequestBody String a);
}
