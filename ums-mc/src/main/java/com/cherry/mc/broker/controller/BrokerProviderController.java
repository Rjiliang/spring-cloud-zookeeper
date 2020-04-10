package com.cherry.mc.broker.controller;


import com.cherry.api.broker.pojo.BrokerNode;
import com.cherry.mc.broker.service.BrokerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class BrokerProviderController {

    @Autowired
    private BrokerService brokerService;

    @GetMapping("/broker/list")
    public List<BrokerNode> getBrokerList(){
        return brokerService.getBrokerList();
    }

}
