package com.gepe.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // exposer "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World updated";
    }

    @GetMapping("/workout")
    public  String getDailyWorkout(){
        return "Run a hard 6k";
    }
}
