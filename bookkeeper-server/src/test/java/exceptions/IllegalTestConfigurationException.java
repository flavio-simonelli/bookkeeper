package exceptions;

public class IllegalTestConfigurationException extends RuntimeException {

    public IllegalTestConfigurationException(String message) {
        super("TEST SETUP ERROR: " + message);
    }

    public IllegalTestConfigurationException(String message, Throwable cause) {
        super("TEST SETUP ERROR: " + message, cause);
    }
}

