package com.myorder.npr.client;

import com.myorder.common.client.HttpClient;
import com.myorder.common.client.JsonUtility;
import com.myorder.common.client.ease2.Ease2Client;
import com.myorder.common.client.ease2.exception.Ease2Exception;
import com.myorder.npr.model.RevokedByThirdPartyMessageResponse;
import com.myorder.npr.model.RevokedByThirdPartyRequest;
import com.myorder.npr.model.RevokedByThirdPartyResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class MuleRevokeClient{

    HttpClient restClient = new HttpClient();
    String url = null;
    private static final Logger LOGGER = LoggerFactory.getLogger(MuleRevokeClient.class);

    private static final String URL_MULE_PATH = "/esb/v1/parkingGarage/revokeByThirdParty";

    private static final String muleEndpoint = "http://localhost:8090";


    public RevokedByThirdPartyResponse receiveRevokeResponse(RevokedByThirdPartyRequest revokeRequest)  throws Ease2Exception {
        try {
            url = muleEndpoint + URL_MULE_PATH;

            String requestStr = JsonUtility.getObjectMapperDefault().writeValueAsString(revokeRequest);

            LOGGER.info("Incoming Revoke by Third Party request: {}", requestStr);

            String responseStr = restClient.send(HttpClient.HTTP_POST, new URL(url), requestStr, getParameters());

            LOGGER.info("Outgoing RevokebyThirdparty Response: {}", responseStr);

            RevokedByThirdPartyMessageResponse respMessage= JsonUtility.getObjectMapperDefault().readValue(responseStr, RevokedByThirdPartyMessageResponse.class);

            RevokedByThirdPartyResponse resp = new RevokedByThirdPartyResponse();
            resp.setMessage(respMessage);
            return resp;

        } catch (Exception e) {
            LOGGER.error("Parking Garage Error URL=[{}] {}", url, e);
            throw new Ease2Exception(e.getMessage(), e);
        }
    }

    public Map<String, String> getParameters() {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("Content-Type", "application/json");
        return paramMap;
    }
}
