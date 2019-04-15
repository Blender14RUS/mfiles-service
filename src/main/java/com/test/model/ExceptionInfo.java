package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExceptionInfo {
    private String message;
    private ExceptionInfo innerException;
    private StackTraceElement[] stack;
}
