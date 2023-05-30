package com.codeup.codeupspringblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public int add(@PathVariable int num1, @PathVariable int num2){
        return num1 +num2;
    }
    @GetMapping("/subtract/{num3}/and/{num4}")
    @ResponseBody
    public int subtract(@PathVariable int num3, @PathVariable int num4){
        return num3 -num4;
    }
    @GetMapping("/multiply/{num5}/and/{num6}")
    @ResponseBody
    public int multiply(@PathVariable int num5, @PathVariable int num6){
        return num5 *num6;
    }
    @GetMapping("/divide/{num7}/and/{num8}")
    @ResponseBody
    public int divide(@PathVariable int num7, @PathVariable int num8){
        return num7 /num8;
    }
}
