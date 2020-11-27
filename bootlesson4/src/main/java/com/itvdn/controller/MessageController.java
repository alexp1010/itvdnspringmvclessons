package com.itvdn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping(path = "/getsomething")
    public String getSomething() {
        return "something";
    }
}
