package com.test.model;

import com.test.model.enums.MFDataType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TypedValue {
    private MFDataType dataType;
    private boolean hasValue;
    private Object value;
    private Lookup lookup;
    private Lookup[] lookups;
    private String displayValue;
    private String sortingKey;
    private String serializedValue;

    public TypedValue(MFDataType dataType, Lookup lookup) {
        this.dataType = dataType;
        this.lookup = lookup;
    }

    public TypedValue(MFDataType dataType, Object value) {
        this.dataType = dataType;
        this.value = value;
    }
}
