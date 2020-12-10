package com.first.firstdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class FirstController {

    @RequestMapping("/test")
    public String test(){
        return "ok";
    }

}
