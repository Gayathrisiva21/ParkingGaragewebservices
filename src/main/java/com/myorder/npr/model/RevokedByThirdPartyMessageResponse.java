package com.myorder.npr.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RevokedByThirdPartyMessageResponse {

    @JsonProperty(value = "paymentAuthorisationId", required = true)
    private String paymentAuthorisationId;

    @JsonProperty(value = "remarkId", required = true)
    private String remarkId;

    @JsonProperty(value = "remark", required = true)
    private String remark;

    public String getPaymentAuthorisationId() {
        return paymentAuthorisationId;
    }

    public void setPaymentAuthorisationId(String paymentAuthorisationId) {
        this.paymentAuthorisationId = paymentAuthorisationId;
    }

    public String getRemarkId() {
        return remarkId;
    }

    public void setRemarkId(String remarkId) {
        this.remarkId = remarkId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "RevokedByThirdPartyMessageResponse{" +
                "paymentAuthorisationId='" + paymentAuthorisationId + '\'' +
                ", remarkId='" + remarkId + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
