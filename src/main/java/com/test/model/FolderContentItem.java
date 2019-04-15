package com.test.model;

import com.test.model.enums.MFFolderContentItemType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FolderContentItem {
    private MFFolderContentItemType folderContentItemType;
    private ObjectVersion objectVersion;
    private TypedValue propertyFolder;
    private Lookup traditionalFolder;
    private View view;
}
