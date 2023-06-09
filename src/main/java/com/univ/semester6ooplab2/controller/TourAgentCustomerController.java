package com.univ.semester6ooplab2.controller;

import com.univ.semester6ooplab2.dto.UserDiscountDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tour-agent-customers")
public class TourAgentCustomerController {

    @GetMapping
    public void getAllUsersWhoBoughtAtLeastOneTour(@RequestParam Integer tourCompanyId) {

    }

    @PutMapping
    public void updateUsersDiscount(@RequestBody List<UserDiscountDto> discountDtoList) {

    }
}
