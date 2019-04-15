package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ObjType {
    private boolean allowAdding;
    private boolean canHaveFiles;
    private int defaultPropertyDef;
    private boolean external;
    private int ID;
    private String namePlural;
    private String name;
    private int ownerPropertyDef;
    private int[] readOnlyPropertiesDuringInsert;
    private int[] readOnlyPropertiesDuringUpdate;
    private boolean realObjectType;
}
