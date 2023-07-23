package com.example.plotline.exceptions;

public class InvalidAccountIdException extends Exception {

    public InvalidAccountIdException() {
    }

    public InvalidAccountIdException(String message) {
        super(message);
    }
}
