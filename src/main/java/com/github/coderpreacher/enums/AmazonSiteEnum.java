package com.github.coderpreacher.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

/**
 * 亚马逊站点枚举
 */

@Getter
@AllArgsConstructor
public enum AmazonSiteEnum {
    /**
     *
     */
    US("US", "United States of America", "01", "COM","ATVPDKIKX0DER"),
    CA("CA", "Canada", "06", "CA","A2EUQ1WTGCTBG2"),
    MX("MX", "Mexico", "10", "MX","A1AM78C64UM0Y8"),
    UK("UK", "United Kingdom", "02", "UK","A1F83G8C2ARO7P"),
    DE("DE", "Germany", "03", "DE","A1PA6795UKMFR9"),
    FR("FR", "France", "04", "FR","A13V1IB3VIYZZH"),
    IT("IT", "Italy", "09", "IT","APJ6JRA9NG5V4"),
    ES("ES", "Spain", "08", "ES","A1RKKUPIHCS9HS"),
    AU("AU", "Australia", "12", "AU","A39IBJ37TRP1C6"),
    JP("JP", "Japan", "07", "JP","A1VC38T7YXB528");
    private final String value;
    private final String country;
    private final String sorftimeSiteId;
    private final String sellerSpriteMarketId;
    private final String amazonMarketplaceId;

    public static AmazonSiteEnum matchNullFail(String value) {
        AmazonSiteEnum siteEnum = null;
        for (AmazonSiteEnum enums : AmazonSiteEnum.values()) {
            if (enums.getValue().equals(value)) {
                siteEnum = enums;
                break;
            }
        }
        Objects.requireNonNull(siteEnum);
        return siteEnum;
    }

    public static AmazonSiteEnum match(String value) {
        AmazonSiteEnum siteEnum = null;
        for (AmazonSiteEnum enums : AmazonSiteEnum.values()) {
            if (enums.getValue().equalsIgnoreCase(value)) {
                siteEnum = enums;
                break;
            }
        }
        return siteEnum;
    }


}
