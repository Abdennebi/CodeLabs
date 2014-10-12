package com.github.appenginelab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "", method = POST)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }
}
