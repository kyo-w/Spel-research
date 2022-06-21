package com.example.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class K8sApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sApplication.class, args);
    }

}
