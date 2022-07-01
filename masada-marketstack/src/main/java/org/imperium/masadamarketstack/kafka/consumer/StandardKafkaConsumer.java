package org.imperium.masadamarketstack.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;

@Slf4j
public class StandardKafkaConsumer implements KafkaConsumer{

    @KafkaListener(topics = "engine-marketstack", groupId = "masada-group")
    @Override
    public void consume(String message) {
        log.info("Marketstack consumed {}", message);
    }
}
