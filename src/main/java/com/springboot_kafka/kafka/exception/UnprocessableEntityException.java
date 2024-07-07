package com.springboot_kafka.kafka.exception;

public class UnprocessableEntityException extends RuntimeException {
    public UnprocessableEntityException(String message) {
        super(message);
    }
}
