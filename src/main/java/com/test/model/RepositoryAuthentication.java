package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RepositoryAuthentication {
    private String configurationName;
    private String username;
    private String password;
    private String authenticationToken;
    private String refreshToken;
}
