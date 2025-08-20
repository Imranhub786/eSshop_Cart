package com.Cart.eShop.exceptions;

@SuppressWarnings("serial")
public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(String message) {
        super(message);
    }
}