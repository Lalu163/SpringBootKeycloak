package com.api.rest.springbootkeycloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControler {
    
    @GetMapping("/hello-1")
    public String helloAdmin(){
        return "Hello Spring Boot With Keycloak - ADMIN";
    }

    @GetMapping("/hello-2")
    public String helloUser(){
        return "Hello Spring Boot With Keycloak - USER";
    }
}
