package com.myorder.npr.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.datatype.XMLGregorianCalendar;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RevokedByThirdPartyRequest {

    @JsonProperty(value = "providerId", required = true)
    private String providerId;

    @JsonProperty(value = "paymentAuthorisationId", required = true)
    private String paymentAuthorisationId;

    @JsonProperty(value = "vehicleId", required = true)
    private String vehicleId;

    @JsonProperty(value = "countryCode")
    private String countryCode;

    @JsonProperty(value = "endDateTime", required = true)
    private XMLGregorianCalendar endDateTime;

    @JsonProperty(value = "amountPSRightCalculated", required = true)
    private Long amountPSRightCalculated;

    @JsonProperty(value = "vatpsRightCalculated", required = true)
    private Long vatpsRightCalculated;

    @JsonProperty(value = "vehicleIdType", required = true)
    private String vehicleIdType;

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getPaymentAuthorisationId() {
        return paymentAuthorisationId;
    }

    public void setPaymentAuthorisationId(String paymentAuthorisationId) {
        this.paymentAuthorisationId = paymentAuthorisationId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(XMLGregorianCalendar endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Long getAmountPSRightCalculated() {
        return amountPSRightCalculated;
    }

    public void setAmountPSRightCalculated(Long amountPSRightCalculated) {
        this.amountPSRightCalculated = amountPSRightCalculated;
    }

    public Long getVatpsRightCalculated() {
        return vatpsRightCalculated;
    }

    public void setVatpsRightCalculated(Long vatpsRightCalculated) {
        this.vatpsRightCalculated = vatpsRightCalculated;
    }

    public String getVehicleIdType() {
        return vehicleIdType;
    }

    public void setVehicleIdType(String vehicleIdType) {
        this.vehicleIdType = vehicleIdType;
    }

    @Override
    public String toString() {
        return "RevokedByThirdPartyRequest{" +
                "providerId='" + providerId + '\'' +
                ", paymentAuthorisationId='" + paymentAuthorisationId + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", endDateTime='" + endDateTime + '\'' +
                ", amountPSRightCalculated=" + amountPSRightCalculated +
                ", vatpsRightCalculated=" + vatpsRightCalculated +
                ", vehicleIdType='" + vehicleIdType + '\'' +
                '}';
    }
}
