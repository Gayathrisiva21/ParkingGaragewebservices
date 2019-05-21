
package com.myorder.npr.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PSRightRevokeByThirdPartyResponseData" type="{http://rdw.nl/rpv/1.0}PSRightRevokeByThirdPartyResponseData" minOccurs="0"/&gt;
 *         &lt;element name="PSRightRevokeByThirdPartyResponseError" type="{http://rdw.nl/rpv/1.0}PSRightRevokeByThirdPartyResponseError" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "psRightRevokeByThirdPartyResponseData",
    "psRightRevokeByThirdPartyResponseError"
})
@XmlRootElement(name = "PSRightRevokeByThirdPartyResponse")
public class PSRightRevokeByThirdPartyResponse {

    @XmlElement(name = "PSRightRevokeByThirdPartyResponseData")
    protected PSRightRevokeByThirdPartyResponseData psRightRevokeByThirdPartyResponseData;
    @XmlElement(name = "PSRightRevokeByThirdPartyResponseError")
    protected PSRightRevokeByThirdPartyResponseError psRightRevokeByThirdPartyResponseError;

    /**
     * Gets the value of the psRightRevokeByThirdPartyResponseData property.
     * 
     * @return
     *     possible object is
     *     {@link PSRightRevokeByThirdPartyResponseData }
     *     
     */
    public PSRightRevokeByThirdPartyResponseData getPSRightRevokeByThirdPartyResponseData() {
        return psRightRevokeByThirdPartyResponseData;
    }

    /**
     * Sets the value of the psRightRevokeByThirdPartyResponseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSRightRevokeByThirdPartyResponseData }
     *     
     */
    public void setPSRightRevokeByThirdPartyResponseData(PSRightRevokeByThirdPartyResponseData value) {
        this.psRightRevokeByThirdPartyResponseData = value;
    }

    /**
     * Gets the value of the psRightRevokeByThirdPartyResponseError property.
     * 
     * @return
     *     possible object is
     *     {@link PSRightRevokeByThirdPartyResponseError }
     *     
     */
    public PSRightRevokeByThirdPartyResponseError getPSRightRevokeByThirdPartyResponseError() {
        return psRightRevokeByThirdPartyResponseError;
    }

    /**
     * Sets the value of the psRightRevokeByThirdPartyResponseError property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSRightRevokeByThirdPartyResponseError }
     *     
     */
    public void setPSRightRevokeByThirdPartyResponseError(PSRightRevokeByThirdPartyResponseError value) {
        this.psRightRevokeByThirdPartyResponseError = value;
    }

}
