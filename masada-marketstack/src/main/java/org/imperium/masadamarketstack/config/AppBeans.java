package org.imperium.masadamarketstack.config;

import org.imperium.masadamarketstack.kafka.consumer.KafkaConsumer;
import org.imperium.masadamarketstack.kafka.consumer.StandardKafkaConsumer;
import org.imperium.masadamarketstack.kafka.producer.KafkaProducer;
import org.imperium.masadamarketstack.kafka.producer.StandardKafkaProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class AppBeans {

    @Bean
    public KafkaProducer producer(KafkaTemplate<String, String> template){
        return new StandardKafkaProducer("marketstack-engine", template);
    }

    @Bean
    public KafkaConsumer consumer(){
        return new StandardKafkaConsumer();
    }

}
