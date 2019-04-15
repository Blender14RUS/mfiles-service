package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class View {
    private boolean common;
    private int ID;
    private String name;
    private int parent;
    private ViewLocation viewLocation;
}
