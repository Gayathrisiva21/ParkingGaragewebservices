
package com.myorder.npr.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PSRightRevokeByThirdPartyResponseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSRightRevokeByThirdPartyResponseData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentAuthorisationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RemarkId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSRightRevokeByThirdPartyResponseData", propOrder = {
    "paymentAuthorisationId",
    "remarkId",
    "remark"
})
public class PSRightRevokeByThirdPartyResponseData {

    @XmlElement(name = "PaymentAuthorisationId", required = true)
    protected String paymentAuthorisationId;
    @XmlElement(name = "RemarkId", required = true)
    protected String remarkId;
    @XmlElement(name = "Remark", required = true)
    protected String remark;

    /**
     * Gets the value of the paymentAuthorisationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAuthorisationId() {
        return paymentAuthorisationId;
    }

    /**
     * Sets the value of the paymentAuthorisationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAuthorisationId(String value) {
        this.paymentAuthorisationId = value;
    }

    /**
     * Gets the value of the remarkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkId() {
        return remarkId;
    }

    /**
     * Sets the value of the remarkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkId(String value) {
        this.remarkId = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
