package org.imperium.masadaengine.mvc.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.imperium.masadaengine.kafka.producer.KafkaProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class EngineController {

    private final KafkaProducer producer;

    @PostMapping(path = "/send")
    public void send(@RequestParam(name = "message") String message){
        producer.send(message);
    }

}
