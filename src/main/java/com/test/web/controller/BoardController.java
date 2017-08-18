package com.test.web.controller;

import com.test.web.entity.PostEntity;
import com.test.web.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
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

    /**
     * 포스트 리스트를 조회하는 메서드
     * Mapping http://~~~ [GET]
     * @return List<PostEntity> 포스트 목록
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<PostEntity> home(){
        return postService.findAll();
    }

    /**
     * 포스트 디테일 페이지. 선택한 하나의 포스트만 가지고 온다
     * Mapping http://localhost:8080/id [GET]
     * @return PostEntity
     * */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public PostEntity detail(@PathVariable(value = "id")String id) {
        return postService.findOne(id);
    }


    /**
     * 포스트 하나를 저장한다
     * Mapping http://localhost:8080/id [POST]
     * @return void
     * */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void writePost(@PathVariable(value="title")String title , @PathVariable(value="content")String content){

        try {

            postService.saveOne(title,content);

        }catch(Exception e){

        }
    }
}
