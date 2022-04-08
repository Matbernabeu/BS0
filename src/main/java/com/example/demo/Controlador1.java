package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {

    @GetMapping("/a")
    public String getOi()
    {
        return "Ola amigo";
    }

}
