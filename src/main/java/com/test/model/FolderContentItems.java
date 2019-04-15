package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FolderContentItems {
    private String path;
    private boolean moreResults;
    private FolderContentItem[] items;
}
