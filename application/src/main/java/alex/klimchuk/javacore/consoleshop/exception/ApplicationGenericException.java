package alex.klimchuk.javacore.consoleshop.exception;

/**
 * Copyright Alex Klimchuk (c) 31.10.2019.
 */
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