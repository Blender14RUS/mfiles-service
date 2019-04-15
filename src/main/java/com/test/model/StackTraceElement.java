package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StackTraceElement {
    private String fileName;
    private int lineNumber;
    private String className;
    private String methodName;
}
