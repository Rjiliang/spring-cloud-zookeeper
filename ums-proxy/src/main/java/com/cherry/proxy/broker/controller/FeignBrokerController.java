package com.cherry.proxy.broker.controller;


import com.cherry.api.broker.pojo.BrokerNode;
import com.cherry.api.broker.service.BrokerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignBrokerController {

    @Autowired
    private BrokerService brokerService = null;

    @GetMapping("/feign/broker/list")
    public List<BrokerNode> getBrokerList(){
        return brokerService.getBrokerList();
    }

    @GetMapping("/feign/broker/get/{id}")
    public BrokerNode getBrokerById(@PathVariable("id") Long id){
        return  brokerService.getBrokerById(id);
    }

    @PostMapping("/feign/broker/add")
    public boolean addBrokerNode(BrokerNode brokerNode){
       return brokerService.addBrokerNode(brokerNode);
    }


}
