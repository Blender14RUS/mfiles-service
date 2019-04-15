package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StatusResponse {
    private boolean successful;
    private String message;
}
