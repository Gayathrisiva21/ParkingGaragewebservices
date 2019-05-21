
package com.myorder.npr.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PSRightRevokeByThirdPartyResponseError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSRightRevokeByThirdPartyResponseError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rdw.nl/rpv/1.0}ResponseError"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RemarkId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSRightRevokeByThirdPartyResponseError", propOrder = {
    "remarkId",
    "remark"
})
public class PSRightRevokeByThirdPartyResponseError
    extends ResponseError
{

    @XmlElement(name = "RemarkId", required = true, nillable = true)
    protected String remarkId;
    @XmlElement(name = "Remark", required = true, nillable = true)
    protected String remark;

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
