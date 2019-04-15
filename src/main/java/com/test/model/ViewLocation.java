package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ViewLocation {
    private TypedValue overlappedFolder;
    private boolean overlapping;
}
