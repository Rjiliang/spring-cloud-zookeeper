package com.cherry.api.broker.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class BrokerNode implements Serializable {

    private Long brokerId;
    private String brokerName;
    private String topic;


}
