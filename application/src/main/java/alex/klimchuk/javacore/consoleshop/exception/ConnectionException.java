package alex.klimchuk.javacore.consoleshop.exception;

/**
 * Copyright Alex Klimchuk (c) 2019.
 */
public class ConnectionException extends ApplicationGenericException {

    public ConnectionException() {
        super();
    }

    public ConnectionException(String message) {
        super(message);
    }

    public ConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConnectionException(Throwable cause) {
        super(cause);
    }

}