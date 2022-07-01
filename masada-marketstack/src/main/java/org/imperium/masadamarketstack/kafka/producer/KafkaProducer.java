package org.imperium.masadamarketstack.kafka.producer;

public interface KafkaProducer {
    void send(String message);
}
