package com.example.consumer;

import com.example.consumer.consumer.MessageConsumer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {})
class ConsumerApplicationTests {

    @Autowired
    private MessageConsumer messageConsumer;

    @Test
    void contextLoads() {
//        messageConsumer.receive();
    }

}
