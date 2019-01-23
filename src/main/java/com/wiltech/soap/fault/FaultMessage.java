package com.wiltech.soap.fault;

import javax.xml.ws.WebFault;

/**
 * The error details ass a message when an exeption is thrown..
 */
@WebFault(name = "FaultElement", faultBean = "com.wiltech.soap.fault.FaultElement")
public class FaultMessage extends Exception {
    private static final long serialVersionUID = 1L;

    private FaultElement fault;

    /**
     * Instantiates a new Fault message.
     */
    public FaultMessage() {
    }

    /**
     * Instantiates a new Fault message.
     * @param fault the fault element
     */
    public FaultMessage(final FaultElement fault) {
        //creates and Exception and pass the message to the super class.
        super(fault.getMessage());
        this.fault = fault;
    }
}
