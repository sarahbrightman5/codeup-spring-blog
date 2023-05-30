package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello from spring!";

    }
    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name){
        return "Hello "+name + "!";
    }
    @GetMapping("/hello/{name1}/and/{name2}")
    @ResponseBody
    public String sayHelloTwo(@PathVariable String name1, @PathVariable String name2){
        return name1 +" says hello to "+ name2 +"!";
    }

}
