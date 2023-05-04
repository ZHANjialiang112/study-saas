package com.zjl.hijpa.service;

import com.zjl.hijpa.domain.entity.Customer;
import com.zjl.hijpa.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {

    @InjectMocks
    private CustomerService customerService;
    @Mock
    private CustomerRepository customerRepository;
    @Mock
    private static Customer customer = new Customer();

    @Test
    public void insert(){
        System.out.println(customer);
        customerService.insert(customer);
    }

    @BeforeAll
    public static void buildCustomer(){
        customer.setName("zjl");
        customer.setAddress("shanghai");
        customer.setEmail("ert");
        customer.setPhone("123");
        customer.setTenantCode("123");
    }
}
