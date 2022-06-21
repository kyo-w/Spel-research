package com.example.produ;

import com.example.produ.producer.MessageProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {ProduApplication.class})
class ProduApplicationTests {
    @Autowired
    private MessageProducer messageProducer;

    @Test
    void contextLoads() {
        messageProducer.send("Hello World");
    }

}
