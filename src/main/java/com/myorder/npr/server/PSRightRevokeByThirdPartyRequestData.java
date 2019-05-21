
package com.myorder.npr.server;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PSRightRevokeByThirdPartyRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSRightRevokeByThirdPartyRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProviderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentAuthorisationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VehicleId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CountryCode" type="{http://rdw.nl/rpv/1.0}UneceLandCodesType" minOccurs="0"/&gt;
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="AmountPSRightCalculated" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="VATPSRightCalculated" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="VehicleIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSRightRevokeByThirdPartyRequestData", propOrder = {
    "providerId",
    "paymentAuthorisationId",
    "vehicleId",
    "countryCode",
    "endDateTime",
    "amountPSRightCalculated",
    "vatpsRightCalculated",
    "vehicleIdType"
})
public class PSRightRevokeByThirdPartyRequestData {

    @XmlElement(name = "ProviderId", required = true)
    protected String providerId;
    @XmlElement(name = "PaymentAuthorisationId", required = true)
    protected String paymentAuthorisationId;
    @XmlElement(name = "VehicleId", required = true)
    protected String vehicleId;
    @XmlElementRef(name = "CountryCode", namespace = "http://rdw.nl/rpv/1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<UneceLandCodesType> countryCode;
    @XmlElement(name = "EndDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "AmountPSRightCalculated", required = true, nillable = true)
    protected BigDecimal amountPSRightCalculated;
    @XmlElementRef(name = "VATPSRightCalculated", namespace = "http://rdw.nl/rpv/1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> vatpsRightCalculated;
    @XmlElementRef(name = "VehicleIdType", namespace = "http://rdw.nl/rpv/1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleIdType;

    /**
     * Gets the value of the providerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * Sets the value of the providerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderId(String value) {
        this.providerId = value;
    }

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
     * Gets the value of the vehicleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleId(String value) {
        this.vehicleId = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UneceLandCodesType }{@code >}
     *     
     */
    public JAXBElement<UneceLandCodesType> getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UneceLandCodesType }{@code >}
     *     
     */
    public void setCountryCode(JAXBElement<UneceLandCodesType> value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the amountPSRightCalculated property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountPSRightCalculated() {
        return amountPSRightCalculated;
    }

    /**
     * Sets the value of the amountPSRightCalculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountPSRightCalculated(BigDecimal value) {
        this.amountPSRightCalculated = value;
    }

    /**
     * Gets the value of the vatpsRightCalculated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getVATPSRightCalculated() {
        return vatpsRightCalculated;
    }

    /**
     * Sets the value of the vatpsRightCalculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setVATPSRightCalculated(JAXBElement<BigDecimal> value) {
        this.vatpsRightCalculated = value;
    }

    /**
     * Gets the value of the vehicleIdType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleIdType() {
        return vehicleIdType;
    }

    /**
     * Sets the value of the vehicleIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleIdType(JAXBElement<String> value) {
        this.vehicleIdType = value;
    }

}
