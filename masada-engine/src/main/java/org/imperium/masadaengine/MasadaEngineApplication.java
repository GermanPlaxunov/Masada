package org.imperium.masadaengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class MasadaEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(MasadaEngineApplication.class, args);
    }

}
