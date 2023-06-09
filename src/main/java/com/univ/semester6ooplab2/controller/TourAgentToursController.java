package com.univ.semester6ooplab2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tour-agent-tours")
public class TourAgentToursController {

    @GetMapping
    public void getAllToursForTourAgent(@RequestParam Integer tourAgentId) {

    }
}
