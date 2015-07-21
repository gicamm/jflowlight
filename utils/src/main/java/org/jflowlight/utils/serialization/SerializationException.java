package org.jflowlight.utils.serialization;

import org.jflowlight.JolException;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class SerializationException extends JolException {

    private static final long serialVersionUID = 3800257253638055512L;

    public SerializationException() {
    }

    public SerializationException(final String message) {
        super(message);
    }

    public SerializationException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public SerializationException(final Throwable cause) {
        super(cause);
    }

    public SerializationException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
