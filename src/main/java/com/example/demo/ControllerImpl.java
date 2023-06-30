package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class ControllerImpl implements  ControllerInterface{

    @Override
    @GetMapping("/{id}")
    public String test(int id) {
        return null;
    }
}
