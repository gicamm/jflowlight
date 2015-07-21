package org.jflowlight;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class JolException extends Exception {
    public JolException() {
    }

    public JolException(String message) {
        super(message);
    }

    public JolException(String message, Throwable cause) {
        super(message, cause);
    }

    public JolException(Throwable cause) {
        super(cause);
    }

    public JolException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
