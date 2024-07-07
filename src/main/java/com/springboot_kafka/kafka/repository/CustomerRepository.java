package com.springboot_kafka.kafka.repository;

import com.springboot_kafka.kafka.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findTopByOrderByIdDesc();
}