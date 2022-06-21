package com.example.produ.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Source.class)
public class MessageProducer {
    @Autowired
    private Source source;

    public void send(String message){
        source.output().send(MessageBuilder.withPayload(message).build());
    }
}
