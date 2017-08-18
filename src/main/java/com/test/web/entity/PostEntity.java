package com.test.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by paige on 27/7/17.
 */
@Entity
@Table(name="POST")
public class PostEntity {

    // JPA에서 entity는 table 로 직접 만들어 진다


    @Id
    private String id;  // 아이디 - UUID 형식
    private String title;   // 제목 - 30자 제한
    private String content; // 내용 -

    /**
     * 포스트의 아이디를 반환한다
     * @return String 아이디 반환
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
