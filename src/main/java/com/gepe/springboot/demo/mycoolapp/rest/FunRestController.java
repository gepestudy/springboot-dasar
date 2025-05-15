package com.gepe.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;

    @Value("${coach.name}")
    private String teamName;

    // exposer "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return String.format("Hello %s from %s", teamName, coachName);
    }


    @GetMapping("/workout")
    public  String getDailyWorkout(){
        return "Run a hard 6k";
    }
}
