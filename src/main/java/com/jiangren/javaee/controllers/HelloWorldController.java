package com.jiangren.javaee.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by seabookchen on 21/08/2017.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String helloworld() {
        return "Hello World!";
    }
}
