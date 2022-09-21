package alex.klimchuk.javacore.consoleshop.exception;

/**
 * Copyright Alex Klimchuk (c) 31.10.2019.
 */
public class RepositoryException extends ApplicationGenericException {

    public RepositoryException() {
        super();
    }

    public RepositoryException(String message) {
        super(message);
    }

    public RepositoryException(Throwable cause) {
        super(cause);
    }

    public RepositoryException(String message, Throwable cause) {
        super(message, cause);
    }

}