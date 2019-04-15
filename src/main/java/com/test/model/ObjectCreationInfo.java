package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ObjectCreationInfo {
    private PropertyValue[] propertyValues;
    private UploadInfo[] files;
}
