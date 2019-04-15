package com.test.model;

import lombok.*;

import java.util.Dictionary;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PluginInfoConfiguration {

    private String name;
    private boolean isDefault;
    private String assemblyName;
    private String bridgeClassName;
    private boolean isScopeIndependent;
    private String protocol;
    private Dictionary<String, String> configuration;
    private Dictionary<String, String> configurationSource;
}
