package com.springboot.SpringBootSecurityJWT.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@RestController
@RequestMapping("/api/v1/greetings")
public class GrettingsController {

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello");
    }

    @GetMapping("/bye")
    public ResponseEntity<String> bye() {
        return ResponseEntity.ok("Bye");
    }

}
