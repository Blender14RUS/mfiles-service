package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PropertyValue {
    private int propertyDef;
    private TypedValue typedValue;
}
