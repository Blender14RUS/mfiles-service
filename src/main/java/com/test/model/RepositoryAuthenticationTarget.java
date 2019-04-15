package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RepositoryAuthenticationTarget {
    private String displayName;
    private String iconID;
    private String ID;
    private PluginInfoConfiguration pluginInfoConfiguration;
    private String requiresUserSpecificAuthentication;
    private RepositoryAuthenticationStatus repositoryAuthenticationStatus;
}
