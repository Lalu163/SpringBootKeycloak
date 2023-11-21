package com.api.rest.springbootkeycloak.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControler {
    
    @GetMapping("/hello-1")
    @PreAuthorize("hasRole('admin_client-role')")
    public String helloAdmin(){
        return "Hello Spring Boot With Keycloak - ADMIN";
    }

    @GetMapping("/hello-2")
    @PreAuthorize("hasRole('user_client-role') or hasRole('admin_client_role')")
    public String helloUser(){
        return "Hello Spring Boot With Keycloak - USER";
    }
}
