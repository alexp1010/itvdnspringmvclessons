package com.itvdn.controller;

import com.itvdn.dto.RequestParamDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/params")
public class ParamsController {

    @GetMapping(path = "/requestparams")
    public ResponseEntity requestParamTest(@RequestParam("id") String id, @RequestParam("name") String name) {
        RequestParamDto requestParamDto = new RequestParamDto(id, name);
        return new ResponseEntity(requestParamDto, HttpStatus.OK);
    }

    @GetMapping(path = "/pathvariables/{id}/{name}")
    public ResponseEntity pathVariableTest(@PathVariable("id") String id, @PathVariable("name") String name) {
        RequestParamDto requestParamDto = new RequestParamDto(id, name);
        return new ResponseEntity(requestParamDto, HttpStatus.OK);
    }
}
