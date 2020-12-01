package com.itvdn.controller;

import com.itvdn.exception.FirstTestException;
import com.itvdn.exception.SecondTestException;
import com.itvdn.exception.ThirdTestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class FirstController {

    @GetMapping("/first")
    public ResponseEntity throwFirstException() throws FirstTestException {
        throw new FirstTestException();
    }

    @GetMapping("/second")
    public ResponseEntity throwSecondException() throws SecondTestException {
        throw new SecondTestException();
    }

    @GetMapping("/third")
    public ResponseEntity throwThirdException() throws ThirdTestException {
        throw new ThirdTestException();
    }
}
