package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ObjID {
    private int ID;
    private int type;
    private String externalRepositoryName;
    private String externalRepositoryObjectID;
}
