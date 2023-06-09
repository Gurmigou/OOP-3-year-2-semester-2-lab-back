package com.univ.semester6ooplab2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tours")
public class CustomerController {

    @GetMapping
    public void getAllTours() {

    }
}
