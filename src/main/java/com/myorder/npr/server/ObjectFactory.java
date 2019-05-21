
package com.myorder.npr.server;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.myorder.npr.server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PIN_QNAME = new QName("http://rdw.nl/rpv/1.0", "PIN");
    private final static QName _PSRightRevokeByThirdPartyRequestDataCountryCode_QNAME = new QName("http://rdw.nl/rpv/1.0", "CountryCode");
    private final static QName _PSRightRevokeByThirdPartyRequestDataVATPSRightCalculated_QNAME = new QName("http://rdw.nl/rpv/1.0", "VATPSRightCalculated");
    private final static QName _PSRightRevokeByThirdPartyRequestDataVehicleIdType_QNAME = new QName("http://rdw.nl/rpv/1.0", "VehicleIdType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.myorder.npr.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PSRightRevokeByThirdPartyRequest }
     * 
     */
    public PSRightRevokeByThirdPartyRequest createPSRightRevokeByThirdPartyRequest() {
        return new PSRightRevokeByThirdPartyRequest();
    }

    /**
     * Create an instance of {@link PSRightRevokeByThirdPartyRequestData }
     * 
     */
    public PSRightRevokeByThirdPartyRequestData createPSRightRevokeByThirdPartyRequestData() {
        return new PSRightRevokeByThirdPartyRequestData();
    }

    /**
     * Create an instance of {@link PSRightRevokeByThirdPartyResponse }
     * 
     */
    public PSRightRevokeByThirdPartyResponse createPSRightRevokeByThirdPartyResponse() {
        return new PSRightRevokeByThirdPartyResponse();
    }

    /**
     * Create an instance of {@link PSRightRevokeByThirdPartyResponseData }
     * 
     */
    public PSRightRevokeByThirdPartyResponseData createPSRightRevokeByThirdPartyResponseData() {
        return new PSRightRevokeByThirdPartyResponseData();
    }

    /**
     * Create an instance of {@link PSRightRevokeByThirdPartyResponseError }
     * 
     */
    public PSRightRevokeByThirdPartyResponseError createPSRightRevokeByThirdPartyResponseError() {
        return new PSRightRevokeByThirdPartyResponseError();
    }

    /**
     * Create an instance of {@link ResponseError }
     * 
     */
    public ResponseError createResponseError() {
        return new ResponseError();
    }

    /**
     * Create an instance of {@link RevokedByThirdPartyRequestResponseError }
     * 
     */
    public RevokedByThirdPartyRequestResponseError createRevokedByThirdPartyRequestResponseError() {
        return new RevokedByThirdPartyRequestResponseError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rdw.nl/rpv/1.0", name = "PIN")
    public JAXBElement<String> createPIN(String value) {
        return new JAXBElement<String>(_PIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UneceLandCodesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rdw.nl/rpv/1.0", name = "CountryCode", scope = PSRightRevokeByThirdPartyRequestData.class)
    public JAXBElement<UneceLandCodesType> createPSRightRevokeByThirdPartyRequestDataCountryCode(UneceLandCodesType value) {
        return new JAXBElement<UneceLandCodesType>(_PSRightRevokeByThirdPartyRequestDataCountryCode_QNAME, UneceLandCodesType.class, PSRightRevokeByThirdPartyRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rdw.nl/rpv/1.0", name = "VATPSRightCalculated", scope = PSRightRevokeByThirdPartyRequestData.class)
    public JAXBElement<BigDecimal> createPSRightRevokeByThirdPartyRequestDataVATPSRightCalculated(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PSRightRevokeByThirdPartyRequestDataVATPSRightCalculated_QNAME, BigDecimal.class, PSRightRevokeByThirdPartyRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rdw.nl/rpv/1.0", name = "VehicleIdType", scope = PSRightRevokeByThirdPartyRequestData.class)
    public JAXBElement<String> createPSRightRevokeByThirdPartyRequestDataVehicleIdType(String value) {
        return new JAXBElement<String>(_PSRightRevokeByThirdPartyRequestDataVehicleIdType_QNAME, String.class, PSRightRevokeByThirdPartyRequestData.class, value);
    }

}
