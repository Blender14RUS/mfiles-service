package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ObjectFile {
    private String changeTimeUtc;
    private String extension;
    private int ID;
    private String name;
    private int version;
}
