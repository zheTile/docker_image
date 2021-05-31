package com.zdx.docker.image.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

  @ResponseBody
  @RequestMapping(value = "/world",method = RequestMethod.GET)
  public String hello(){
    System.out.println("ddddddddd");
    return "hellworld";
  }
}
