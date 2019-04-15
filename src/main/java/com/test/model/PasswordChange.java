package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PasswordChange {
    private String oldPassword;
    private String newPassword;
}
