package org.imperium.masadamarketstack.kafka.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;

@Slf4j
@RequiredArgsConstructor
public class StandardKafkaProducer implements KafkaProducer{

    private final String topic;
    private final KafkaTemplate<String, String> template;

    @Override
    public void send(String message) {
        template.send(topic, message);
        log.info("Marketstack send: {} to {}", message, topic);
    }
}