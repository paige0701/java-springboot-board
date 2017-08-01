package com.test.web.controller;

import com.test.web.entity.PostEntity;
import com.test.web.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by paige on 25/7/17.
 */
@Controller
@RequestMapping("/")
public class BoardController {

    @Autowired
    PostService postService;


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<PostEntity> home(){
        return postService.findAll();
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public PostEntity detail(@PathVariable(value = "id")String id) {
        return postService.findOne(id);
    }
}
