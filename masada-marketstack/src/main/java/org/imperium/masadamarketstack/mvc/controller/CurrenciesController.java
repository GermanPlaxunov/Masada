package org.imperium.masadamarketstack.mvc.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/currencies")
public class CurrenciesController {

    @PostMapping(path = "/get")
    public void getCurrencies(@RequestParam(name = "limit", required = false) Integer limit,
                              @RequestParam(name = "offset", required = false) Integer offset){

    }

}
