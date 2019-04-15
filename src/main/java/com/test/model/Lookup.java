package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Lookup {
    private boolean deleted;
    private String displayValue;
    private boolean hidden;
    private int item;
    private int version;

    public Lookup(int item, int version) {
        this.item = item;
        this.version = version;
    }
}
