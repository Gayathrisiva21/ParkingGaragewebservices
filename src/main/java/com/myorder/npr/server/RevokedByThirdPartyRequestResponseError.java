
package com.myorder.npr.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevokedByThirdPartyRequestResponseError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevokedByThirdPartyRequestResponseError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rdw.nl/rpv/1.0}ResponseError"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevokedByThirdPartyRequestResponseError", propOrder = {
    "statusReference"
})
public class RevokedByThirdPartyRequestResponseError
    extends ResponseError
{

    @XmlElement(name = "StatusReference", required = true, nillable = true)
    protected String statusReference;

    /**
     * Gets the value of the statusReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusReference() {
        return statusReference;
    }

    /**
     * Sets the value of the statusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusReference(String value) {
        this.statusReference = value;
    }

}
