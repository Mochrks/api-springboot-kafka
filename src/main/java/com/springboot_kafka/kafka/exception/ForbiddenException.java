package com.springboot_kafka.kafka.exception;

public class ForbiddenException extends RuntimeException {
    public ForbiddenException(String message) {
        super(message);
    }
}
