package com.itvdn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {

    @GetMapping(path = "/information")
    public void getSomeInformation() {
    }
}
