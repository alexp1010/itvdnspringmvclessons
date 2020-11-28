package com.itvdn.controller;

import com.itvdn.dto.UserDto;
import com.itvdn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class ValidationController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/getuser")
    public UserDto getUserById(@RequestParam(value = "id") long id) {
        return userService.getUser(id);
    }

    @PutMapping(path = "/updateuser")
    public ResponseEntity updateUser(@Validated @RequestBody UserDto user) {
        userService.addUser(user);
        return new ResponseEntity(HttpStatus.OK);
    }
}
