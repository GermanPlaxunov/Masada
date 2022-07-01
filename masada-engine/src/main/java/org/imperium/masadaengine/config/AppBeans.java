package org.imperium.masadaengine.config;

import org.imperium.masadaengine.kafka.consumer.KafkaConsumer;
import org.imperium.masadaengine.kafka.consumer.StandardKafkaConsumer;
import org.imperium.masadaengine.kafka.producer.KafkaProducer;
import org.imperium.masadaengine.kafka.producer.StandardKafkaProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class AppBeans {

    @Bean
    public KafkaProducer producer(KafkaTemplate<String, String> template){
        return new StandardKafkaProducer("engine-marketstack", template);
    }

    @Bean
    public KafkaConsumer consumer(){
        return new StandardKafkaConsumer();
    }

}
