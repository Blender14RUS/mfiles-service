package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VersionComment {
    private PropertyValue lastModifiedBy;
    private ObjVer objVer;
    private PropertyValue statusChanged;
    private PropertyValue comment;
}
