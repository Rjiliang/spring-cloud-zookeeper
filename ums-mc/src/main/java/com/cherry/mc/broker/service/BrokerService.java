package com.cherry.mc.broker.service;


import com.cherry.api.broker.pojo.BrokerNode;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface BrokerService {

    List<BrokerNode>  getBrokerList();

    BrokerNode getBrokerById(Long id);

    boolean addBrokerNode(BrokerNode brokerNode);

}
