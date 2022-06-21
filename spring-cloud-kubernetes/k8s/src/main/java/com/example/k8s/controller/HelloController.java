package com.example.k8s.controller;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.dsl.KubernetesListMixedOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.kubernetes.discovery.KubernetesDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @RequestMapping("/services")
    public List<String> services(){
//        KubernetesDiscoveryClient kubernetesDiscoveryClient =(KubernetesDiscoveryClient)this.discoveryClient;
//        KubernetesClient client = kubernetesDiscoveryClient.getClient();
//        KubernetesListMixedOperation lists = client.
//        System.out.println(lists);
        return this.discoveryClient.getServices();
    }
}
