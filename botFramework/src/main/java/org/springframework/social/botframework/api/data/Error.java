package org.springframework.social.botframework.api.data;

/**
 * Defines an error.
 * @author Anton Leliuk
 */
public class Error {

    /**
     * Error code.
     */
    private String code;

    /**
     * A description of the error.
     */
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
