package com.myorder.npr.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2019-05-23T10:52:07.798+02:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "http://rdw.nl/rpv/1.0", name = "IRegistration")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IRegistration {

    @WebMethod(operationName = "RevokedByThirdParty", action = "http://localhost:8083/IRegistration/RevokedByThirdParty")
    @Action(input = "http://rdw.nl/rpv/1.0/IRegistration/RevokedByThirdParty", output = "http://rdw.nl/rpv/1.0/IRegistration/RevokedByThirdPartyResponse")
    @WebResult(name = "PSRightRevokeByThirdPartyResponse", targetNamespace = "http://rdw.nl/rpv/1.0", partName = "parameters")
    public PSRightRevokeByThirdPartyResponse revokedByThirdParty(
        @WebParam(partName = "parameters", name = "PSRightRevokeByThirdPartyRequest", targetNamespace = "http://rdw.nl/rpv/1.0")
        PSRightRevokeByThirdPartyRequest parameters
    );
}
