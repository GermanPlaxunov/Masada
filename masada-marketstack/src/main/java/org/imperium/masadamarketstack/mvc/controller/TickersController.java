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
@RequestMapping(path = "/tickers")
public class TickersController {

    @PostMapping(path = "/get")
    public void getTickers(@RequestParam(name = "exchange", required = false) String exchange,
                           @RequestParam(name = "search", required = false) String search,
                           @RequestParam(name = "limit", required = false) Integer limit,
                           @RequestParam(name = "offset", required = false) Integer offset
    ) {

    }

}
