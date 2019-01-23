package com.wiltech.soap.dto;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;

/**
 * this is usd to pass attachments to the web service. It will allow binary data as the file.
 */
@XmlType()
@XmlAccessorType(XmlAccessType.FIELD)
public class AttachmentData {

    //annotation to make sure the field is holding binary data
    @XmlMimeType(("application/octet-stream"))
    private DataHandler imageData;

    public DataHandler getImageData() {
        return imageData;
    }

    public void setImageData(DataHandler imageData) {
        this.imageData = imageData;
    }
}
