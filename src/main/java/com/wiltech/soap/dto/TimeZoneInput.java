package com.wiltech.soap.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Web service inout data class.
 */
@XmlRootElement
public class TimeZoneInput implements Serializable {
    private static final long serialVersionUID = -7509024419870908605L;

    //the zone name on which the current date and time is
    private String zoneName;

    //to hold attachment
    private AttachmentData attachmentData;

    /**
     * Gets zone name.
     * @return the zone name
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * Sets zone name.
     * @param zoneName the zone name
     */
    public void setZoneName(final String zoneName) {
        this.zoneName = zoneName;
    }

    /**
     * Gets attachment data.
     * @return the attachment data
     */
    public AttachmentData getAttachmentData() {
        return attachmentData;
    }

    /**
     * Sets attachment data.
     * @param attachmentData the attachment data
     */
    public void setAttachmentData(final AttachmentData attachmentData) {
        this.attachmentData = attachmentData;
    }
}
