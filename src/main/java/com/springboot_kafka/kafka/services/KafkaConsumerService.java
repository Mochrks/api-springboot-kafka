package com.springboot_kafka.kafka.services;

import com.springboot_kafka.kafka.dto.CustomerDTO;
import com.springboot_kafka.kafka.model.Customer;
import com.springboot_kafka.kafka.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class KafkaConsumerService {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);
    @Autowired
    private CustomerRepository customerRepository;

    @KafkaListener(topics = "customer_topic", groupId = "customer_group")
    public void consume(Customer customer) {
        logger.info("Consume data in kafka , and save data to database postgrees: {}", customer);
        customerRepository.save(customer);
    }
}
