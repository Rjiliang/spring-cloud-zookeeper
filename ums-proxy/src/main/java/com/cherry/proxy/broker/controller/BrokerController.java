package com.cherry.proxy.broker.controller;


import com.cherry.api.broker.pojo.BrokerNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class BrokerController {

    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/broker/list")
    public List<BrokerNode> getBrokerList(){
        return restTemplate.getForObject("http://ums-mc/broker/list",List.class);
    }


}
