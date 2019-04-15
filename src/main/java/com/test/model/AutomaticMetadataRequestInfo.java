package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AutomaticMetadataRequestInfo {
    private int[] uploadIds;
    private PropertyValue[] propertyValues;
    private ObjVer objVer;
    private int objectType;
    private String[] metadataProviderIds;
    private String customData;
}
