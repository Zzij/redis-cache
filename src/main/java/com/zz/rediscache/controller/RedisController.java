package com.zz.rediscache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzj
 * @className RedisController
 * @description TODO
 * @date 2020/6/4
 */
@RestController
@RequestMapping(value = "redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate redisTemplate;


    @GetMapping(value = "add")
    public String testAdd(){
        redisTemplate.opsForValue().set("aaa", "bbb");
        return "success";
    }
}
