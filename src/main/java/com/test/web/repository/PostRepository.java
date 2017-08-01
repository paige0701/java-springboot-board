package com.test.web.repository;
import com.test.web.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Created by paige on 1/8/17.
 */
@Repository
public interface PostRepository extends JpaRepository<PostEntity,String> {

}
