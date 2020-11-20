package com.ept.demo.model;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/11/20 15:51
 * @Version 1.0
 **/
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
