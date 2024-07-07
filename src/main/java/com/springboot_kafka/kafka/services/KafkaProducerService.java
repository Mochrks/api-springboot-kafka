package com.springboot_kafka.kafka.services;

import com.springboot_kafka.kafka.controller.CustomerController;
import com.springboot_kafka.kafka.dto.CustomerDTO;
import com.springboot_kafka.kafka.model.Customer;
import com.springboot_kafka.kafka.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;

@Service
public class KafkaProducerService {

    private static final Logger logger = LoggerFactory.getLogger(KafkaProducerService.class);
    private static final String TOPIC = "customer_topic";

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Autowired
    private CustomerRepository customerRepository;

    public void sendMessage(CustomerDTO customer) {
        final LocalDateTime now = LocalDateTime.now();
        logger.info("Sending data to Kafka: {} ", customer);

        Customer id = customerRepository.findTopByOrderByIdDesc();

        Customer dataCustomer = Customer.builder()
                .id(id.getId() + 1)
                .name(customer.getName())
                .email(customer.getEmail())
                .phone(customer.getPhone())
                .address(customer.getAddress())
                .createdAt(now)
                .updatedAt(now)
                .build();

        kafkaTemplate.send(TOPIC, dataCustomer);
    }
}
