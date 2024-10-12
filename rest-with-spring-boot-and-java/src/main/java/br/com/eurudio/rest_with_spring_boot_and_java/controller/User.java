package br.com.eurudio.rest_with_spring_boot_and_java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class User {
    @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        return "ola " + name;
    }

}
