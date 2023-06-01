package com.example.gradledemo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping(value="test", produces = MediaType.APPLICATION_JSON_VALUE )
    public String test(){
        return "Test is OK!!!";
    }
}