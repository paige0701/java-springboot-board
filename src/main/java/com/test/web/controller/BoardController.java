package com.test.web.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by paige on 25/7/17.
 */
@Controller
@EnableAutoConfiguration
public class BoardController {


    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "This is the board list";
    }
}
