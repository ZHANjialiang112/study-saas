package com.zjl.hijpa.adapter;

import com.zjl.hijpa.domain.entity.Customer;
import com.zjl.hijpa.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public void insert(){
        customerService.insert(Customer.builder()
                .name("name")
                        .address("address")
                        .email("email")
                        .phone("phone")
                        .tenantCode("zjl")
                .build());
    }
}
