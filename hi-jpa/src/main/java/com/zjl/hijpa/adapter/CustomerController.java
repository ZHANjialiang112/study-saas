package com.zjl.hijpa.adapter;

import com.zjl.hijpa.domain.entity.Customer;
import com.zjl.hijpa.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public void insert() {
        customerService.insert(Customer.builder()
                .name("name")
                .address("address")
                .email("email")
                .phone("phone")
                .tenantCode("zjl")
                .data(Arrays.asList("1", "2"))
                .build());
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable("id") String id) {
        return customerService.getById(id);
    }
}
