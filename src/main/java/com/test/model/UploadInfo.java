package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UploadInfo {
    private int uploadID;
    private String title;
    private String extension;
    private long size;
}
