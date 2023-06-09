package com.example.mySpace.users;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
