package com.itvdn.controller;

import com.itvdn.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/async")
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/test")
    public ResponseEntity asyncTest() {
        asyncService.doAsync();
        return new ResponseEntity("request processed", HttpStatus.OK);
    }
}
