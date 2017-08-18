//package com.test.web;
//
//import com.test.web.controller.BoardController;
//import com.test.web.repository.PostRepository;
//import com.test.web.service.PostService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
///**
// * Created by Paige on 8/6/17.
// */
//@RunWith( SpringRunner.class )
//@WebMvcTest( value = BoardController.class, secure = false )
//public class boardTests {
//
//    @Autowired
//    PostRepository _postRepository;
//
//    @Autowired
//    private MockMvc _mvc;
//
//    @MockBean
//    private PostService _postSvc;
//
////    @Test
////    public void crudTest() {
////
////        // CREATE, READ, UPDATE, DELETE
////
////        PostEntity post = new PostEntity();
////
////        post.setId("1000");
////        post.setContent("This is the content test");
////        post.setTitle("This is the title of the list");
////        _postRepository.saveAndFlush(post);
////        System.out.println(ToStringBuilder.reflectionToString(post, ToStringStyle.MULTI_LINE_STYLE));
////
////    }
//
//    @Test
//    public void home() throws Exception {
//
//        System.out.println( "=============== testFindAll ===============" );
//
//        // Call
//        this._mvc.perform( get( "/home" ) )
//                .andDo( print() )
//                .andExpect( status().isOk() )
//                ;
//
//    }   // Method - testFindQueries
//
//
//
//}
