package com.itvdn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    //@Null
    private long id;
    //@Null
    private String name;
    //@Null
    private String lastname;
    @NotNull
    private String login;
    @NotNull
    private String password;
    @NotNull
    @Email
    private String email;
}