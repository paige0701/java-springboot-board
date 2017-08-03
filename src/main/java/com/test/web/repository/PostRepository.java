package com.test.web.repository;
import com.test.web.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Created by paige on 1/8/17.
 */
@Repository
public interface PostRepository extends JpaRepository<PostEntity,String> {

    // 스프링 데이터를 공부할떄는 repository 개념을 잘 이해해야한다.
    // 스프링 데이터는 Abstract repository 를 제공하는데 이것이 저 위에있는 JpaRepository 같음
    // JpaRepository 는 base interface 이다
    // 1 . 저 abstract repository는 기본 CRUD 기능을 제공하기 때문에 extend 만 한다면
    // CRUD 정도는 따로 만들어서 사용할 필요 없이 간단하고 편리하게 사용할 수 있다
    // 2. create proxy instance for you repository interface

    // JpaRepository를 extend 로 사용할때는 2개의 parameter를 사용해야한다.
    // 첫번째는 repository에서 사용할 entity이고 (import 필요), 두번쨰는 entity id의 field 이다



}
