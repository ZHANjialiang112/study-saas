package com.zjl.hijpa.service;
import com.querydsl.jpa.impl.JPAQuery;
import com.zjl.hijpa.domain.entity.Customer;
import com.zjl.hijpa.domain.entity.QCustomer;
import com.zjl.hijpa.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final EntityManager entityManager;

    public void insert(Customer customer){
        customerRepository.save(customer);
    }

    public List<Customer>  searchCustomerList(){
        QCustomer customer = QCustomer.customer;

        JPAQuery<Customer> query = new JPAQuery<>(entityManager);

        return query.select(customer)
                .from(customer)
                .where(customer.address.eq("背景"))
                .fetch();
    }
}
