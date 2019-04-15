package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PropertyValueSuggestion {
    private String displayValue;
    private boolean isFact;
    private boolean isNewValue;
    private int propertyDef;
    private float quality;
    private TypedValue typedValue;
}
