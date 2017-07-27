package com.test.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by paige on 27/7/17.
 */
@Entity
@Table(name="POST")
public class PostEntity extends AbstractEntity {

    @Id
    private String id;
    private String title;
    private String content;





}
