package org.imperium.masadaengine.kafka.producer;

public interface KafkaProducer {
    void send(String message);
}
