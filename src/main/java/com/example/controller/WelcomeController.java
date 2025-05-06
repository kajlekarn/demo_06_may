package com.example.controller;

import com.example.DemoApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/controller")
public class WelcomeController {

    private final static Logger LOGGER = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/{username}")
    public ResponseEntity<String> welcomeController(@PathVariable String username) {
        LOGGER.info("Welcome Controller Executed!!");
        return ResponseEntity.ok("Welcome " + username);
    }
}
