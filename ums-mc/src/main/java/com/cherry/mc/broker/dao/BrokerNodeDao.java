package com.cherry.mc.broker.dao;


import com.cherry.api.broker.pojo.BrokerNode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BrokerNodeDao {

    List<BrokerNode> getBrokerList();

}
