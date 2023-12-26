package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @Value("${person.age}")
    private int age;

    @Value("${address[0]}")
    private String name2;

    @Autowired
    private Environment env;

    @RequestMapping("/hello2")
    public String hello2(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(name2);
        System.out.println("_____________________");
        System.out.println(env.getProperty("person.age"));
        return "hello";
    }


    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
