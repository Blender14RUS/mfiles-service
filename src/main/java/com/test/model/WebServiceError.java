package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WebServiceError {
    private int status;
    private String URL;
    private String method;
    private ExceptionInfo exception;
}
