package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ObjectWorkflowState {
    private PropertyValue state;
    private int stateID;
    private String StateName;
    private PropertyValue workflow;
    private int workflowID;
    private String workflowName;
    private String versionComment;
}
