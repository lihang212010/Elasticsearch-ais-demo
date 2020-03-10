package com.ais.demo.controller.find;

import com.ais.demo.entity.User;
import com.ais.demo.template.UserTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*@author:lihang
 *@email:631533483@qq.com
 * 这个类的主要作用是演示模板的使用方式
 *The main function of this class is to demonstrate how to use the template
 * */
@RestController
public class FindController {

    @Resource
    UserTemplate userTemplate;

    @RequestMapping("findUser")
    public List<User> findUser(User user) throws IOException {
        return userTemplate.find(user);
    }

    @RequestMapping("updateUser")
    public String updateUser(User user) throws IOException {
        try {
            Map<String,String> map=new HashMap<>();
            map.put("name","走姊姊");
            return userTemplate.update(user,map).toString();
        }catch (Exception e){
            return e.toString();
        }

    }

    @RequestMapping("insertUser")
    public String insertUser(User user){
        try {
           return userTemplate.insert(user).toString();
        } catch (Exception e) {
            return "error" + e;
        }
    }

    @RequestMapping("deleteUser")
    public String deleteUser(User user){
        try {
            return userTemplate.delete(user).toString();
        }catch (Exception e){
            return e.toString();
        }
    }


}
