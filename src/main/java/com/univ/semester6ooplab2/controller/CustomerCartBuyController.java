package com.univ.semester6ooplab2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart-buy")
public class CustomerCartBuyController {

    @PostMapping
    public void customBuyTour(@RequestParam Integer userId,
                              @RequestParam Integer tourId,
                              @RequestParam Integer tourCompanyId) {

    }
}
