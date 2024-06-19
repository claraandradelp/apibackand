package com.finalbackend.apiback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meunome")
public class MeuNome {

    @GetMapping
    public String getMeuNome(){
        return "Maria Clara Andrade Lopes";
    }

}
