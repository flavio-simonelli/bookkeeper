package utils;

public class InvalidTestConfigurationException extends RuntimeException {

    public InvalidTestConfigurationException(String message) {
        super(message);
    }

    public InvalidTestConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}

