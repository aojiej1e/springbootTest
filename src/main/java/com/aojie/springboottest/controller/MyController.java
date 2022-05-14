package com.aojie.springboottest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aojie
 * @Function
 * @create 2022-05-14 23:45
 */
@RestController
@Slf4j
public class MyController {
    @GetMapping("/hello")
    public String httpTest(){
        return "Hello World!";
    }
}
