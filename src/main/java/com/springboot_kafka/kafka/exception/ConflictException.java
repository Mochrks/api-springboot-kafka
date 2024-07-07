package com.springboot_kafka.kafka.exception;

public class ConflictException extends RuntimeException {
    public ConflictException(String message) {
        super(message);
    }
}
