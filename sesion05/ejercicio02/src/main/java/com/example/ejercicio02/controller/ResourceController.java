package com.example.ejercicio02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
    @GetMapping("/admin")
    public String admin(){
        return "Admin!";
    }
    @GetMapping("/user")
    public String user(){
        return "user!";
    }
    @GetMapping("/all")
    public String all(){
        return "All Users!";
    }

    @GetMapping("/delete")
    public String delete(@RequestBody String s){
        return "Deleting "+s;
    }
    @GetMapping("/login")
    public String login(){
        return "Login!";
    }
    @GetMapping("/tutor")
    public String tutor(){
        return "Tutor!";
    }

}
