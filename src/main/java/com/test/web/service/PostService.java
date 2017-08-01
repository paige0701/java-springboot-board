package com.test.web.service;

import com.test.web.entity.PostEntity;
import com.test.web.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by paige on 1/8/17.
 */

@Service
public class PostService {

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
