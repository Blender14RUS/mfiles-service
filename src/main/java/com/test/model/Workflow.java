package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Workflow {
    private int ID;
    private String name;
    private int objectClass;
}
