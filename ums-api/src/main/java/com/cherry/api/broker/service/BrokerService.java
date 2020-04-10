package com.cherry.api.broker.service;


import com.cherry.api.broker.pojo.BrokerNode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient(value = "ums-mc")
public interface BrokerService {

    @GetMapping("/broker/get/{id}")
    BrokerNode getBrokerById(@PathVariable("id") Long id);

    @GetMapping("/broker/list")
    List<BrokerNode>  getBrokerList();

    @PostMapping("/broker/add")
    boolean addBrokerNode(BrokerNode brokerNode);

}
