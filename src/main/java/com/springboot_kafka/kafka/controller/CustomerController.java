package com.springboot_kafka.kafka.controller;

import com.springboot_kafka.kafka.dto.CustomerDTO;
import com.springboot_kafka.kafka.model.Customer;
import com.springboot_kafka.kafka.services.KafkaProducerService;
import com.springboot_kafka.kafka.utils.ResponseUtil;
import com.springboot_kafka.kafka.common.Urls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping(Urls.CREATE_CUSTOMER_KAFKA)
    public ResponseEntity<Map<String, Object>> createCustomer(@RequestBody CustomerDTO customer) {
        logger.info("Create data customer: {}", customer);
        kafkaProducerService.sendMessage(customer);
        return ResponseUtil.createSuccess(customer);
    }
}
