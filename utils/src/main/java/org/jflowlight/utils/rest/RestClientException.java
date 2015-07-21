package org.jflowlight.utils.rest;

import org.jflowlight.JolException;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class RestClientException extends JolException {

    private static final long serialVersionUID = -6098066743881642987L;

    public RestClientException() {
    }

    public RestClientException(final String message) {
        super(message);
    }

    public RestClientException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public RestClientException(final Throwable cause) {
        super(cause);
    }

    public RestClientException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
