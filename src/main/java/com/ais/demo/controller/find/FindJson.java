package com.ais.demo.controller.find;

import com.ais.demo.dao.UserJson;
import com.ais.demo.dao.UserSenior;
import com.ais.demo.entity.User;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*@author:lihang
 *@email:631533483@qq.com
 *这个类的主要作用是演示@Elasitcsearch的使用方式
 *The main purpose of this class is to demonstrate the usage of @ elasitcsearch
 *  */
@RestController
public class FindJson {

    @Autowired
    UserJson userJson;

    @Autowired
    UserSenior userSenior;

    @RequestMapping("/findName")
    public List<User> findName(String name){
        return userJson.findName(name);
    }


    @RequestMapping("/findIdName")
    public List<User> findIdName(String name,String id){
        return userJson.findIdName(name,id);
    }

    @RequestMapping("/findSenior")
    public List<User> findSenior(User user){
        return userSenior.findSenior(user);
    }

    @RequestMapping("/findSeniorTest")
    public List<User> findSeniorTest(User user){
        return userSenior.findSeniorTest(user);
    }

}
