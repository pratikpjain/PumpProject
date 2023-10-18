package com.example.EasySelect.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HealthCheckAPI {
    @GetMapping("/")
    public ResponseEntity DefaultAPI() {
        return new ResponseEntity<>("Hi, application is live on port 8080", HttpStatus.OK);
    }
    @GetMapping("/health-check")
    public ResponseEntity HealthAPI() {
        return new ResponseEntity<>("Health check api", HttpStatus.OK);
    }
}
