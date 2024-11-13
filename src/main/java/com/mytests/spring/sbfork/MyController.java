package com.mytests.spring.sbfork;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class MyController {

    @Value("${test.value}") String testValue;

    @GetMapping("/test1")
    public String test1() {
        System.out.println("test1 with " + testValue + " profile");
        return "test1";
    }

    @GetMapping("/test2")
    public String test2() {
        return "test2 with " + testValue + " profile";
    }
}
