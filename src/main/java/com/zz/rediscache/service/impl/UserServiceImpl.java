package com.zz.rediscache.service.impl;

import com.zz.rediscache.dao.UserRepository;
import com.zz.rediscache.entity.User;
import com.zz.rediscache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author zzj
 * @className UserServiceImpl
 * @description TODO
 * @date 2020/6/3
 */

@Service
@CacheConfig(cacheNames = "userService:")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Cacheable(key = "#id")
    public User getById(int id) {
        Optional<User> optional = userRepository.findById(id);

        return optional.get();

    }


    @Override
    @CacheEvict(key = "#user.id")
    public boolean updateById(User user) {
        userRepository.save(user);
        return true;
    }

    @Override
    @Cacheable(key = "#name")
    public User getByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    @Cacheable( key = "{#domain,#name}")
    public User getByDomain(String domain, String name) {
        return userRepository.findByName(name);
    }
}
