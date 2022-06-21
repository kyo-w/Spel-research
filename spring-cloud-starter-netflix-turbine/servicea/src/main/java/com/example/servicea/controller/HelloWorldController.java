package com.example.servicea.controller;

import com.example.servicea.Myinterface;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorldController {
    private static String url1 ="http://serviceb/hello";
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Myinterface myinterface;

    @RequestMapping("/hello")
    public String info(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity(url1, String.class);
        return forEntity.getBody();
    }

    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping("/hellofeign")
    public String hellofeign(){
        return myinterface.hello();
    }

    public String fallback(){
        return "失败";
    }
}
