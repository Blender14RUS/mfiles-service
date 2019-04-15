package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ValueListItem {
    private String displayID;
    private boolean hasOwner;
    private boolean hasParent;
    private int ID;
    private String name;
    private int	ownerID;
    private int parentID;
    private int valueListID;
}
