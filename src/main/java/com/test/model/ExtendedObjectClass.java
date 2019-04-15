package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExtendedObjectClass extends ObjectClass {
    private AssociatedPropertyDef[]	associatedPropertyDefs;
    private ObjectVersion[] templates;

}
