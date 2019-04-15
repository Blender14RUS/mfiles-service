package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Authentication {
    private String username;
    private String password;
    private String domain;
    private boolean windowsUser;
    private String computerName;
    private String vaultGuid;
    private String expiration;
    private boolean readOnly;
    private String URL;
    private String method;

    public Authentication(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
