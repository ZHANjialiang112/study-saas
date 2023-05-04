package com.zjl.hijpa.repository;

import com.zjl.hijpa.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String>, QuerydslPredicateExecutor<Customer> {

}






