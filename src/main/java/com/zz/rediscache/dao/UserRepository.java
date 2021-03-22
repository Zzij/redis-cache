package com.zz.rediscache.dao;

import com.zz.rediscache.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author zzj
 * @className UserRepository
 * @description TODO
 * @date 2020/6/3
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "select u from User u where name=?1")
    User findByName(String name);
}
