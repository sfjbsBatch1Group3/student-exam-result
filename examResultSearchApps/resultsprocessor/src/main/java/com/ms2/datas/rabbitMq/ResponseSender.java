package com.ms2.datas.rabbitMq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponseSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    String exchange ="response.exchange";
    String routingkey ="response.routingkey" ;

    public void send(String student) {
        rabbitTemplate.convertAndSend(exchange, routingkey, student);

    }
}
