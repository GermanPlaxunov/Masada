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
@RequestMapping(path = "/splits")
public class SplitsController {

    @PostMapping(path = "/get")
    public void getSplits(@RequestParam(name = "symbols") String symbols,
                          @RequestParam(name = "sort", required = false) String sort,
                          @RequestParam(name = "dateFrom", required = false) String dateFrom,
                          @RequestParam(name = "dateTo", required = false) String dateTo,
                          @RequestParam(name = "limit", required = false) Integer limit,
                          @RequestParam(name = "offset", required = false) Integer offset
    ) {

    }

}
