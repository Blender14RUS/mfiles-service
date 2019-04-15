package com.test.model.enums;

import com.google.gson.annotations.SerializedName;

public enum  MFFolderContentItemType {

    @SerializedName("0")
    Unknown (0),

    @SerializedName("1")
    ViewFolder (1),

    @SerializedName("2")
    PropertyFolder (2),

    @SerializedName("3")
    TraditionalFolder (3),

    @SerializedName("4")
    ObjectVersion (4),

    @SerializedName("5")
    ExternalViewFolder (5);


    private final int value;
    public int getValue() {
        return value;
    }

    private MFFolderContentItemType(int value) {
        this.value = value;
    }
}
