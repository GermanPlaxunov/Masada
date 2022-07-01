package org.imperium.masadaengine.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;

@Slf4j
public class StandardKafkaConsumer implements KafkaConsumer{

    @KafkaListener(topics = "marketstack-engine", groupId = "masada-group")
    @Override
    public void consume(String message) {
        log.info("Engine consumed {}", message);
    }
}
