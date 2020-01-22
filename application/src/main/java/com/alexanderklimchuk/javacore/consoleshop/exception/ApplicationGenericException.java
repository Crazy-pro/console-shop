package com.alexanderklimchuk.javacore.consoleshop.exception;

public class ApplicationGenericException extends RuntimeException {

    public ApplicationGenericException() {
        super();
    }

    public ApplicationGenericException(String message) {
        super(message);
    }

    public ApplicationGenericException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationGenericException(Throwable cause) {
        super(cause);
    }

}