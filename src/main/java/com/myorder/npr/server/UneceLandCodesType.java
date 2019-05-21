
package com.myorder.npr.server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UneceLandCodesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UneceLandCodesType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="AFG"/&gt;
 *     &lt;enumeration value="AL"/&gt;
 *     &lt;enumeration value="AM"/&gt;
 *     &lt;enumeration value="AND"/&gt;
 *     &lt;enumeration value="AUS"/&gt;
 *     &lt;enumeration value="AZ"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="BD"/&gt;
 *     &lt;enumeration value="BDS"/&gt;
 *     &lt;enumeration value="BF"/&gt;
 *     &lt;enumeration value="BG"/&gt;
 *     &lt;enumeration value="BH"/&gt;
 *     &lt;enumeration value="BIH"/&gt;
 *     &lt;enumeration value="BOL"/&gt;
 *     &lt;enumeration value="BR"/&gt;
 *     &lt;enumeration value="BRN"/&gt;
 *     &lt;enumeration value="BRU"/&gt;
 *     &lt;enumeration value="BS"/&gt;
 *     &lt;enumeration value="BUR"/&gt;
 *     &lt;enumeration value="BVI"/&gt;
 *     &lt;enumeration value="BW"/&gt;
 *     &lt;enumeration value="BY"/&gt;
 *     &lt;enumeration value="CAM"/&gt;
 *     &lt;enumeration value="CDN"/&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="CI"/&gt;
 *     &lt;enumeration value="CL"/&gt;
 *     &lt;enumeration value="CO"/&gt;
 *     &lt;enumeration value="CR"/&gt;
 *     &lt;enumeration value="CU"/&gt;
 *     &lt;enumeration value="CY"/&gt;
 *     &lt;enumeration value="CZ"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="DK"/&gt;
 *     &lt;enumeration value="DOM"/&gt;
 *     &lt;enumeration value="DY"/&gt;
 *     &lt;enumeration value="DZ"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="EAK"/&gt;
 *     &lt;enumeration value="EAT"/&gt;
 *     &lt;enumeration value="EAU"/&gt;
 *     &lt;enumeration value="EAZ"/&gt;
 *     &lt;enumeration value="EC"/&gt;
 *     &lt;enumeration value="ER"/&gt;
 *     &lt;enumeration value="ES"/&gt;
 *     &lt;enumeration value="EST"/&gt;
 *     &lt;enumeration value="ET"/&gt;
 *     &lt;enumeration value="ETH"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="FIN"/&gt;
 *     &lt;enumeration value="FJI"/&gt;
 *     &lt;enumeration value="FL"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="GB"/&gt;
 *     &lt;enumeration value="GBA"/&gt;
 *     &lt;enumeration value="GBG"/&gt;
 *     &lt;enumeration value="GBJ"/&gt;
 *     &lt;enumeration value="GBM"/&gt;
 *     &lt;enumeration value="GBZ"/&gt;
 *     &lt;enumeration value="GCA"/&gt;
 *     &lt;enumeration value="GE"/&gt;
 *     &lt;enumeration value="GH"/&gt;
 *     &lt;enumeration value="GR"/&gt;
 *     &lt;enumeration value="GUY"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="HKJ"/&gt;
 *     &lt;enumeration value="HR"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="IL"/&gt;
 *     &lt;enumeration value="IND"/&gt;
 *     &lt;enumeration value="IR"/&gt;
 *     &lt;enumeration value="IRL"/&gt;
 *     &lt;enumeration value="IRQ"/&gt;
 *     &lt;enumeration value="IS"/&gt;
 *     &lt;enumeration value="J"/&gt;
 *     &lt;enumeration value="JA"/&gt;
 *     &lt;enumeration value="K"/&gt;
 *     &lt;enumeration value="KS"/&gt;
 *     &lt;enumeration value="KWT"/&gt;
 *     &lt;enumeration value="KZ"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="LAO"/&gt;
 *     &lt;enumeration value="LAR"/&gt;
 *     &lt;enumeration value="LB"/&gt;
 *     &lt;enumeration value="LS"/&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LV"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="MA"/&gt;
 *     &lt;enumeration value="MC"/&gt;
 *     &lt;enumeration value="MD"/&gt;
 *     &lt;enumeration value="MAL"/&gt;
 *     &lt;enumeration value="MEX"/&gt;
 *     &lt;enumeration value="MGL"/&gt;
 *     &lt;enumeration value="MK"/&gt;
 *     &lt;enumeration value="MNE"/&gt;
 *     &lt;enumeration value="MOC"/&gt;
 *     &lt;enumeration value="MS"/&gt;
 *     &lt;enumeration value="MW"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="NA"/&gt;
 *     &lt;enumeration value="NAM"/&gt;
 *     &lt;enumeration value="NAU"/&gt;
 *     &lt;enumeration value="NEP"/&gt;
 *     &lt;enumeration value="NIC"/&gt;
 *     &lt;enumeration value="NL"/&gt;
 *     &lt;enumeration value="NZ"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="PE"/&gt;
 *     &lt;enumeration value="PK"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="PNG"/&gt;
 *     &lt;enumeration value="PY"/&gt;
 *     &lt;enumeration value="Q"/&gt;
 *     &lt;enumeration value="RA"/&gt;
 *     &lt;enumeration value="RC"/&gt;
 *     &lt;enumeration value="RCA"/&gt;
 *     &lt;enumeration value="RCB"/&gt;
 *     &lt;enumeration value="RCH"/&gt;
 *     &lt;enumeration value="RG"/&gt;
 *     &lt;enumeration value="RH"/&gt;
 *     &lt;enumeration value="RI"/&gt;
 *     &lt;enumeration value="RIM"/&gt;
 *     &lt;enumeration value="RL"/&gt;
 *     &lt;enumeration value="RM"/&gt;
 *     &lt;enumeration value="RMM"/&gt;
 *     &lt;enumeration value="RN"/&gt;
 *     &lt;enumeration value="RNR"/&gt;
 *     &lt;enumeration value="RO"/&gt;
 *     &lt;enumeration value="ROK"/&gt;
 *     &lt;enumeration value="ROU"/&gt;
 *     &lt;enumeration value="RP"/&gt;
 *     &lt;enumeration value="RSM"/&gt;
 *     &lt;enumeration value="RU"/&gt;
 *     &lt;enumeration value="RUS"/&gt;
 *     &lt;enumeration value="RWA"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="SA"/&gt;
 *     &lt;enumeration value="SD"/&gt;
 *     &lt;enumeration value="SGP"/&gt;
 *     &lt;enumeration value="SK"/&gt;
 *     &lt;enumeration value="SLO"/&gt;
 *     &lt;enumeration value="SME"/&gt;
 *     &lt;enumeration value="SN"/&gt;
 *     &lt;enumeration value="SO"/&gt;
 *     &lt;enumeration value="SRB"/&gt;
 *     &lt;enumeration value="SUD"/&gt;
 *     &lt;enumeration value="SY"/&gt;
 *     &lt;enumeration value="SYR"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="TCH"/&gt;
 *     &lt;enumeration value="TD"/&gt;
 *     &lt;enumeration value="TG"/&gt;
 *     &lt;enumeration value="TJ"/&gt;
 *     &lt;enumeration value="TM"/&gt;
 *     &lt;enumeration value="TN"/&gt;
 *     &lt;enumeration value="TR"/&gt;
 *     &lt;enumeration value="TT"/&gt;
 *     &lt;enumeration value="UA"/&gt;
 *     &lt;enumeration value="UAE"/&gt;
 *     &lt;enumeration value="USA"/&gt;
 *     &lt;enumeration value="UZ"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *     &lt;enumeration value="VN"/&gt;
 *     &lt;enumeration value="WAG"/&gt;
 *     &lt;enumeration value="WAN"/&gt;
 *     &lt;enumeration value="WG"/&gt;
 *     &lt;enumeration value="WL"/&gt;
 *     &lt;enumeration value="WS"/&gt;
 *     &lt;enumeration value="WV"/&gt;
 *     &lt;enumeration value="YAR"/&gt;
 *     &lt;enumeration value="YV"/&gt;
 *     &lt;enumeration value="ZA"/&gt;
 *     &lt;enumeration value="ZRE"/&gt;
 *     &lt;enumeration value="ZW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UneceLandCodesType")
@XmlEnum
public enum UneceLandCodesType {

    A,
    AFG,
    AL,
    AM,
    AND,
    AUS,
    AZ,
    B,
    BD,
    BDS,
    BF,
    BG,
    BH,
    BIH,
    BOL,
    BR,
    BRN,
    BRU,
    BS,
    BUR,
    BVI,
    BW,
    BY,
    CAM,
    CDN,
    CH,
    CI,
    CL,
    CO,
    CR,
    CU,
    CY,
    CZ,
    D,
    DK,
    DOM,
    DY,
    DZ,
    E,
    EAK,
    EAT,
    EAU,
    EAZ,
    EC,
    ER,
    ES,
    EST,
    ET,
    ETH,
    F,
    FIN,
    FJI,
    FL,
    FR,
    G,
    GB,
    GBA,
    GBG,
    GBJ,
    GBM,
    GBZ,
    GCA,
    GE,
    GH,
    GR,
    GUY,
    H,
    HKJ,
    HR,
    I,
    IL,
    IND,
    IR,
    IRL,
    IRQ,
    IS,
    J,
    JA,
    K,
    KS,
    KWT,
    KZ,
    L,
    LAO,
    LAR,
    LB,
    LS,
    LT,
    LV,
    M,
    MA,
    MC,
    MD,
    MAL,
    MEX,
    MGL,
    MK,
    MNE,
    MOC,
    MS,
    MW,
    N,
    NA,
    NAM,
    NAU,
    NEP,
    NIC,
    NL,
    NZ,
    P,
    PA,
    PE,
    PK,
    PL,
    PNG,
    PY,
    Q,
    RA,
    RC,
    RCA,
    RCB,
    RCH,
    RG,
    RH,
    RI,
    RIM,
    RL,
    RM,
    RMM,
    RN,
    RNR,
    RO,
    ROK,
    ROU,
    RP,
    RSM,
    RU,
    RUS,
    RWA,
    S,
    SA,
    SD,
    SGP,
    SK,
    SLO,
    SME,
    SN,
    SO,
    SRB,
    SUD,
    SY,
    SYR,
    T,
    TCH,
    TD,
    TG,
    TJ,
    TM,
    TN,
    TR,
    TT,
    UA,
    UAE,
    USA,
    UZ,
    V,
    VN,
    WAG,
    WAN,
    WG,
    WL,
    WS,
    WV,
    YAR,
    YV,
    ZA,
    ZRE,
    ZW;

    public String value() {
        return name();
    }

    public static UneceLandCodesType fromValue(String v) {
        return valueOf(v);
    }

}
