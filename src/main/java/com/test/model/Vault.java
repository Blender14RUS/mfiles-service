package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Vault {
    private String name;
    private String GUID;
    private String authentication;
}
