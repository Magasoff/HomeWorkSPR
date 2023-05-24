package com.example.homeworkspr.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Создаем класс FirstController и делаем его контроллером
// с помощью аннотации @RestController
@RestController
@RequestMapping
public class FirstController {

    // Создаем метод showHelloWorld() и помечаем его аннотацией @GetMapping
    @GetMapping
    public String showHelloWorld(){
        return "Hello World";
    }
}