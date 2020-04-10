package com.cherry.mc.broker.service;

import com.cherry.api.broker.pojo.BrokerNode;
import com.cherry.mc.broker.dao.BrokerNodeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrokerServiceImpl implements BrokerService {

    @Autowired
    private BrokerNodeDao brokerNodeDao;

    @Override
    public List<BrokerNode> getBrokerList() {
        return brokerNodeDao.queryAll();
    }
}
