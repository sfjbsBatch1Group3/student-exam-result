package com.ms2.datas.rabbitMq;

import com.ms2.datas.repository.ResultRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RequestConsumer {
    @Bean
    public Jackson2JsonMessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }

    @Autowired
    ResponseSender responseSender;

    @Autowired
    ResultRepository repository;

    @RabbitListener(queues = "request.queue")
    public void recievedMessage(String name) {
        responseSender.send(repository.findById(name).toString());
    }
}
