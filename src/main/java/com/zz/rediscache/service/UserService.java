package com.zz.rediscache.service;

import com.zz.rediscache.entity.User;

/**
 * @author zzj
 * @className UserService
 * @description TODO
 * @date 2020/6/3
 */
public interface UserService {


    User getById(int id);

    User getByName(String name);

    User getByDomain(String domain, String name);

    boolean updateById(User user);

}
