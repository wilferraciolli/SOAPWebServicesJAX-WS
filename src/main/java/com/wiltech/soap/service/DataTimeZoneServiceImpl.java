package com.wiltech.soap.service;

import javax.jws.WebService;

import com.wiltech.soap.dto.TimeZoneInput;
import com.wiltech.soap.fault.FaultMessage;

/**
 * The type Data time zone service implementation.
 */
@WebService(endpointInterface = "com.wiltech.soap.service.DataTimeZoneService", serviceName = "DateTimeZoneService")
public class DataTimeZoneServiceImpl implements DateTimeZoneService {

    //default application error code
    private final Integer errorCode = 1000;

    //to hold the content of te file
    //the file will be saved on the path below
    private final String serverAttachmentFile = "E:/Files/AttachmentContents.txt";

    /**
     * Implementation of the get time zone ids method.
     * @param zone the zone
     * @return
     * @throws FaultMessage
     */
    public String getDateTimeByZone(final TimeZoneInput zone) throws FaultMessage {
        return "Europe/London";
    }
}
