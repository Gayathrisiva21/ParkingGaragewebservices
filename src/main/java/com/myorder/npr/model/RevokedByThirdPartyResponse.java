package com.myorder.npr.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.myorder.common.client.ease2.model.GenericResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RevokedByThirdPartyResponse extends GenericResponse{

    @JsonProperty("message")
    private RevokedByThirdPartyMessageResponse message;

    public RevokedByThirdPartyMessageResponse getMessage() {
        return message;
    }

    public void setMessage(RevokedByThirdPartyMessageResponse message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "RevokedByThirdPartyResponse{" +
                "version='" +getVersion() +"'\n" +
                ", time='" + getTime() + "'\n" +
                ", result='" + getResult() + "'+\n" +
                ", method='" + getMethod() + "'+\n" +
                "message=" + message +
                '}';
    }
}
