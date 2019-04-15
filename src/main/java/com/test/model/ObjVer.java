package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ObjVer {
    private int ID;
    private int type;
    private int version;
    private String externalRepositoryName;
    private String externalRepositoryObjectID;
    private String externalRepositoryObjectVersionID;
}
