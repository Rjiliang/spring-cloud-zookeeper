package com.cherry.proxy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProxyBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ProxyBootstrap.class,args);
    }
}
