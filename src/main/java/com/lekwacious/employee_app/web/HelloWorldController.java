package com.lekwacious.employee_app.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/status")
    String helloWorld() {
        return "Hello World!";
    }

}
