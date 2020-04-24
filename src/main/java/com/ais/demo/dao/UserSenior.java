package com.ais.demo.dao;

import com.ais.demo.entity.User;
import com.alibaba.fastjson.JSONObject;


import java.util.List;
import org.springframework.boot.elasticsearch.ais.annotation.Elasticsearch;

/*@author:lihang
 *@email:631533483@qq.com */

@Elasticsearch
public interface UserSenior {
    List<User> findSenior(User user);
    List<User> findSeniorTest(User user);
}
