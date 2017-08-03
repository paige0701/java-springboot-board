package com.test.web.service;

import com.test.web.entity.PostEntity;
import com.test.web.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by paige on 1/8/17.
 */

// @Service annotation 은 Service class라는 것을 알려준다.
@Service
public class PostService {


    // Autowired 라는 annotation repository 를 service layer애 dependency injection 을 위하여 사용한다
    @Autowired
    PostRepository _postRepository;

    public List<PostEntity> findAll(){
        List<PostEntity> result = _postRepository.findAll();
        return result;

    }

    public PostEntity findOne(String id){
        PostEntity result = _postRepository.findOne(id);
        return result;
    }

}
