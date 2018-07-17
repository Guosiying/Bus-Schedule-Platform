package com.bus.busposition.message;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zzy
 * @date 2018/7/17下午3:29
 */
public class MqSender{

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        //amqpTemplate.convertAndSend("");
    }
}
