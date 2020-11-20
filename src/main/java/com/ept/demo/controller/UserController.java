package com.ept.demo.controller;

import com.ept.demo.b.BizException;
import com.ept.demo.b.CommonErrorInfo;
import com.ept.demo.model.User;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/11/20 15:51
 * @Version 1.0
 **/
@RestController
public class UserController {

    @PostMapping("/user")
    public boolean insert(@RequestBody User user) {
        System.out.println("开始新增...");

        //原Assert
        Assert.notNull(user, "用户不存在.");

        //自定义的Assert
        com.ept.demo.b.Assert.notNull(user,"用户不存在.");
        com.ept.demo.b.Assert.notNull(user, CommonErrorInfo.BODY_NOT_MATCH);

        //如果姓名为空就手动抛出一个自定义的异常！
        if (user.getName() == null) {
            throw new BizException("-1", "用户姓名不能为空！");
        }
        return true;
    }

    @PutMapping("/user")
    public boolean update(@RequestBody User user) {
        System.out.println("开始更新...");
        //这里故意造成一个空指针的异常，并且不进行处理
        String str = null;
        str.equals("111");
        return true;
    }

    @DeleteMapping("/user")
    public boolean delete(@RequestBody User user) {
        System.out.println("开始删除...");
        //这里故意造成一个异常，并且不进行处理
        Integer.parseInt("abc123");
        return true;
    }

    @GetMapping("/user")
    public List<User> findByUser(User user) {
        System.out.println("开始查询...");
        //自定义的Assert
        com.ept.demo.b.Assert.notNull(user.getId(),"用户不存在.");

        List<User> userList = new ArrayList<>();
        User user2 = new User();
        user2.setId(1L);
        user2.setName("xuwujing");
        user2.setAge(18);
        userList.add(user2);
        return userList;
    }


}
