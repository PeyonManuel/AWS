package com.example.encuentro2.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(path = "/")
public class RestauranteController {

    @GetMapping(path = "test")
    private String getRestauranteById() {
            return "test funciona";
    }

}