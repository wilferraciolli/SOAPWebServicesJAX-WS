package com.wiltech.soap.fault;

import java.io.Serializable;

/**
 * To hold error details when an exception occurs.
 * Holds error ode and details.
 */
public class FaultElement implements Serializable {
    private static final long serialVersionUID = 4625831173742775678L;

    //holds the error code Eg 400, 404
    private int code;

    //message with error details
    private String message;

    /**
     * Gets code.
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets code.
     * @param code the code
     */
    public void setCode(final int code) {
        this.code = code;
    }

    /**
     * Gets message.
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     * @param message the message
     */
    public void setMessage(final String message) {
        this.message = message;
    }
}
