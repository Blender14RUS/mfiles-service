package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RepositoryAuthenticationStatus {
    private String accountName;
    private int extensionAuthenticationSpecialUserType;
    private String targetID;
    private String userID;
}
