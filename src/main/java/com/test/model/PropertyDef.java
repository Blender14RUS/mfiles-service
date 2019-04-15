package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PropertyDef {
    private boolean allObjectTypes;
    private String automaticValue;
    private int automaticValueType;
    private boolean basedOnValueList;
    private int dataType;
    private int ID;
    private String name;
    private int objectType;
    private int valueList;
}
