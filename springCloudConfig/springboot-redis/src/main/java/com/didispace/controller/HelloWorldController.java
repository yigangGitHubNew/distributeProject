package com.didispace.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/helloworld",method = RequestMethod.GET)
    public String helloWorld(){
        return "hello world";
    }

    @RequestMapping(value = "/success",method = RequestMethod.GET)
    public String success(){
        return "success";
    }

    @RequestMapping(value = "/failure",method = RequestMethod.GET)
    public String error(){
        return "failure";
    }

}
