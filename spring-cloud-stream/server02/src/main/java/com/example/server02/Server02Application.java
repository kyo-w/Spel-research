package com.example.server02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Server02Application {

    public static void main(String[] args) {
        SpringApplication.run(Server02Application.class, args);
    }

}
