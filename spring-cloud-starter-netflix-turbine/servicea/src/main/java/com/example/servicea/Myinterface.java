package com.example.servicea;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("serviceb")
public interface Myinterface {
    @RequestMapping("/hello")
    String hello();
}
