package com.zz.rediscache.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author zzj
 * @className User
 * @description TODO
 * @date 2020/6/3
 */

@Data
@Table(name="t_user")
@Entity
public class User {

    @Id
    private int id;

    private String name;

    private int age;

    private String des;
}
