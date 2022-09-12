package alex.klimchuk.javacore.consoleshop.exception;

/**
 * Copyright Alex Klimchuk (c) 2019.
 */
public class OrderException extends ApplicationGenericException {

    public OrderException() {
        super();
    }

    public OrderException(String message) {
        super(message);
    }

    public OrderException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderException(Throwable cause) {
        super(cause);
    }

}