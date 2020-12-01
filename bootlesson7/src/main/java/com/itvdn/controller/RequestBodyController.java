package com.itvdn.controller;

import com.itvdn.dto.RequestBodyDto;
import com.itvdn.dto.RequestBodyResponse;
import com.itvdn.service.RequestBodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBodyController {

    @Autowired
    RequestBodyService requestBodyService;

    @GetMapping("/body")
    public ResponseEntity doSomethingWithRequestBody(@RequestBody RequestBodyDto requestBodyDto) {
        RequestBodyResponse requestBodyResponse = requestBodyService.doSomething(requestBodyDto);
        return new ResponseEntity(requestBodyResponse, HttpStatus.OK);
    }
}
