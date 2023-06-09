package com.univ.semester6ooplab2.controller;

import com.univ.semester6ooplab2.dto.UserTourDto;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CustomerCartController {

    @PostMapping
    public void customerAddTourToCart(@RequestBody UserTourDto userTourDto) {

    }

    @GetMapping
    public void getAllToursFromCart(@RequestParam Integer userId) {

    }

    @DeleteMapping
    public void deleteTourFromCart(@RequestParam Integer userId,
                                   @RequestParam Integer tourId) {

    }
}
