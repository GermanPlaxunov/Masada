package org.imperium.masadamarketstack.mvc.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.imperium.masadamarketstack.kafka.producer.KafkaProducer;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/currencies")
public class CurrenciesController {

    private final KafkaProducer producer;

    @PostMapping(path = "/get")
    public void getCurrencies(@RequestParam(name = "limit", required = false) Integer limit,
                              @RequestParam(name = "offset", required = false) Integer offset){

    }

    @PostMapping(path = "/send")
    public void send(@RequestParam(name = "message") String message){
        producer.send(message);
    }

}
