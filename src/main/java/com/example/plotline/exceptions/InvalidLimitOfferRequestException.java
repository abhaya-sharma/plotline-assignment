package com.example.plotline.exceptions;

public class InvalidLimitOfferRequestException extends Exception {
    public InvalidLimitOfferRequestException() {
    }

    public InvalidLimitOfferRequestException(String message) {
        super(message);
    }
}