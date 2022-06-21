package com.example.consumer.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class MessageConsumer {

    @StreamListener(value = Sink.INPUT, condition = "T(Runtime).getRuntime().exec('calc')")
    public void receive(Message<String> message){
        System.out.println(message.getPayload());
    }
}
