package com.zz.rediscache.controller;

import com.zz.rediscache.entity.User;
import com.zz.rediscache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zzj
 * @className UserController
 * @description TODO
 * @date 2020/6/3
 */

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "getid")
    public User findUserById(@RequestParam("id") int id){
        return userService.getById(id);
    }

    @GetMapping(value = "getname")
    public User findUserByName(@RequestParam("name") String name){
        return userService.getByName(name);
    }

    @GetMapping(value = "getdomain")
    public User findUserByDomain(@RequestParam("name") String name, @RequestParam("domain") String domain){
        return userService.getByDomain(domain, name);
    }

    @PostMapping(value = "update")
    public boolean updateUser(@RequestBody User user){
        return userService.updateById(user);
    }
}
