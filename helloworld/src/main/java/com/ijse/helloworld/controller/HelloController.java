package com.ijse.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello world";
    }

    @PostMapping("/hello")
    public String postHelloWorld() {
        return "post request to hello world";
    }

    @GetMapping("/read")
    public String readSomthing() {
        return " Reading an returning response";
    }

    @PostMapping("/read")
    public String postReadSomething() {
        return "Posting an returning response ";
    }
}