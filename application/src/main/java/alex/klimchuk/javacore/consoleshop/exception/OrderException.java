package alex.klimchuk.javacore.consoleshop.exception;

/**
 * Copyright Alex Klimchuk (c) 31.10.2019.
 */
public class OrderException extends ApplicationGenericException {

    public OrderException() {
        super();
    }

    public OrderException(String message) {
        super(message);
    }

    public OrderException(Throwable cause) {
        super(cause);
    }

    public OrderException(String message, Throwable cause) {
        super(message, cause);
    }

}
