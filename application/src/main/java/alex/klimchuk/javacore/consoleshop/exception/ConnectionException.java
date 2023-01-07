package alex.klimchuk.javacore.consoleshop.exception;

/**
 * Copyright Alex Klimchuk (c) 31.10.2019.
 */
public class ConnectionException extends ApplicationGenericException {

    public ConnectionException() {
        super();
    }

    public ConnectionException(String message) {
        super(message);
    }

    public ConnectionException(Throwable cause) {
        super(cause);
    }

    public ConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

}
