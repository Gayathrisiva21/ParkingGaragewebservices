package com.myorder.npr.server;

import com.myorder.common.client.JsonUtility;
import com.myorder.npr.client.MuleRevokeClient;
import com.myorder.npr.model.RevokedByThirdPartyMessageResponse;
import com.myorder.npr.model.RevokedByThirdPartyRequest;
import com.myorder.npr.model.RevokedByThirdPartyResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebService;

@WebService(
        name = "IRegistration",
        portName = "IRegistration",
        serviceName = "Registration",
        endpointInterface = "com.myorder.npr.server.IRegistration",
        targetNamespace = "http://rdw.nl/rpv/1.0")
public class RegistrationImpl implements IRegistration {

    private static final Logger LOG = LoggerFactory.getLogger(RegistrationImpl.class);

    private MuleRevokeClient muleClient;

    @Override
    public PSRightRevokeByThirdPartyResponse revokedByThirdParty(PSRightRevokeByThirdPartyRequest request) {

        LOG.info("Inside Server impl, ThirdPartyrevoke request:{}", request);
        PSRightRevokeByThirdPartyResponse response = new PSRightRevokeByThirdPartyResponse();
        PSRightRevokeByThirdPartyResponseData respData = new PSRightRevokeByThirdPartyResponseData();
        RevokedByThirdPartyMessageResponse respMessage=null;

        try {
            if (request != null) {

            muleClient=new MuleRevokeClient();
            RevokedByThirdPartyRequest revokedByThirdPartyRequest = createRevokebythirdPartyReq(request);

            RevokedByThirdPartyResponse revokedByThirdPartyResponse =muleClient.receiveRevokeResponse(revokedByThirdPartyRequest);
            LOG.info("Revokeby thirdpartyResponse:{}",revokedByThirdPartyResponse);

            if(revokedByThirdPartyResponse != null){
                respMessage=revokedByThirdPartyResponse.getMessage();
                if(respMessage.getPaymentAuthorisationId() != null){
                    respData.setPaymentAuthorisationId(respMessage.getPaymentAuthorisationId());
                }
                if(respMessage.getRemark() != null){
                    respData.setRemark(respMessage.getRemark());
                }
                if(respMessage.getRemarkId() != null){
                    respData.setRemarkId(respMessage.getRemarkId());
                }
            }
            response.setPSRightRevokeByThirdPartyResponseData(respData);

        }
        }catch (Exception e) {
            LOG.info("Exception in parsing Request: {}",e.getMessage());
        }
        return response;
    }

    private RevokedByThirdPartyRequest createRevokebythirdPartyReq(PSRightRevokeByThirdPartyRequest request) {
        RevokedByThirdPartyRequest req = new RevokedByThirdPartyRequest();
        PSRightRevokeByThirdPartyRequestData reqData = request.getPSRightRevokeByThirdPartyRequestData();
        req.setProviderId(reqData.getProviderId());
        req.setPaymentAuthorisationId(reqData.getPaymentAuthorisationId());
        req.setAmountPSRightCalculated(reqData.getAmountPSRightCalculated().longValue());
        req.setVatpsRightCalculated(reqData.getVATPSRightCalculated().getValue().longValue());
        req.setCountryCode(reqData.getCountryCode().getValue().value());
        req.setEndDateTime(reqData.getEndDateTime());
        req.setVehicleId(reqData.getVehicleId());
        req.setVehicleIdType(reqData.getVehicleIdType().getValue());

        return req;
    }
}
