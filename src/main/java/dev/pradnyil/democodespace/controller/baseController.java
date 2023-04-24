package dev.pradnyil.democodespace.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class baseController {
    @GetMapping("/")
    public String index() {
        return "Hello World!!!";
    }
}