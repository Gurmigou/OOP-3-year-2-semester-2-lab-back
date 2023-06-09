package com.univ.semester6ooplab2.controller;

import com.univ.semester6ooplab2.dto.TourDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tour-agent")
public class TourAgentController {

    @PostMapping
    public void createTour(@RequestBody TourDto tourDto) {

    }

    @PutMapping
    public void updateTour(@RequestBody TourDto tourDto) {

    }
}
