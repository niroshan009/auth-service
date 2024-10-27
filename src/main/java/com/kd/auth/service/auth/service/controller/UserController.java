package com.kd.auth.service.auth.service.controller;



import jakarta.annotation.security.RolesAllowed;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/unsecured")
    public String getunSecured(){
        return "This is unsecured";
    }

    @GetMapping("/secured")
    @RolesAllowed("ROLE_user")
    public String getSecured() {
        return "This is secured";
    }
}
