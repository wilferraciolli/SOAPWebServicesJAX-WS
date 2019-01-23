package com.wiltech.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

import com.wiltech.soap.dto.TimeZoneInput;
import com.wiltech.soap.fault.FaultMessage;

/**
 * The web service interface.
 * Added MTOm and Webservice annotation to allow binary data to be passed as attachment file
 */
@MTOM(enabled = true)
@WebService
public interface DateTimeZoneService {

    /**
     * Gets date time by zone.
     * @param zone the zone
     * @return the date time by zone
     * @throws FaultMessage the fault message
     */
    @WebMethod(action = "timeZoneAction")
    String getDateTimeByZone(@WebParam(name = "TimeZone") TimeZoneInput zone) throws FaultMessage;
}
