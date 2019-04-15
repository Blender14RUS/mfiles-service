package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WorkflowState {
    private String name;
    private int ID;
    private boolean selectable;
}
