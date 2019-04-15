package com.test.model.enums;

import com.google.gson.annotations.SerializedName;

public enum MFDataType {

    @SerializedName("0")
    Uninitialized (0),

    @SerializedName("1")
    Text (1),

    @SerializedName("2")
    Integer (2),

    @SerializedName("3")
    Floating (3),

    @SerializedName("5")
    Date (5),

    @SerializedName("6")
    Time (6),

    @SerializedName("7")
    Timestamp (7),

    @SerializedName("8")
    Boolean (8),

    @SerializedName("9")
    Lookup (9),

    @SerializedName("10")
    MultiSelectLookup (10),

    @SerializedName("11")
    Integer64 (11),

    @SerializedName("12")
    FILETIME (12),

    @SerializedName("13")
    MultiLineText (13),

    @SerializedName("14")
    ACL (14);

    private final int value;
    public int getValue() {
        return value;
    }

    private MFDataType(int value) {
        this.value = value;
    }
}
