package com.healthcarebluebook.ggd;

import java.util.zip.ZipEntry;

/**
 * Created by ajohnson on 5/16/16.
 */
public class HcbbFairPrice {
    private String _fairPrice;
    private String _highPrice;
    private String _zipCode;
    private String _procedureName;

    public HcbbFairPrice(String procedureName, String zipCode, String fairPrice, String highPrice) {
        _fairPrice = fairPrice;
        _highPrice = highPrice;
        _zipCode = zipCode;
        _procedureName = procedureName;
    }

    public String getFairPrice() {
        return _fairPrice;
    }

    public String getHighPrice() {
        return _highPrice;
    }

    public String getZipCode() {
        return _zipCode;
    }

    public String getProcedureName() {
        return _procedureName;
    }
}
