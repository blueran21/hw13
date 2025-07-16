package com.example.httpsdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/api/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Your verification works", HttpStatus.OK);
    }
}
