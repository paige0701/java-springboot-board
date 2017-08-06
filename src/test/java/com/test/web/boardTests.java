package com.test.web;

import com.test.web.entity.PostEntity;
import com.test.web.repository.PostRepository;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Paige on 8/6/17.
 */
public class boardTests extends AbstractTests{

    @Autowired
    PostRepository _postRepository;

    @Test
    public void crudTest() {

        // CREATE, READ, UPDATE, DELETE

        PostEntity post = new PostEntity();

        post.setId("1000");
        post.setContent("This is the content test");
        post.setTitle("This is the title of the list");
        _postRepository.saveAndFlush(post);
        System.out.println(ToStringBuilder.reflectionToString(post, ToStringStyle.MULTI_LINE_STYLE));

    }

}
