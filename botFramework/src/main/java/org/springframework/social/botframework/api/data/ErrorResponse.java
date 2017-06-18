package org.springframework.social.botframework.api.data;

/**
 * Defines an HTTP API response.
 * @author Anton Leliuk
 */
public class ErrorResponse {

    /**
     * An {@link Error} object that contains information about the error.
     */
    private Error error;

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
