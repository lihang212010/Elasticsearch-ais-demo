package com.ais.demo.dao;

import com.ais.demo.entity.User;
import com.alibaba.fastjson.JSONObject;
import com.elasticsearch.ais.annotation.Elasticsearch;
import com.elasticsearch.ais.annotation.ElasticsearchAsync;

import java.util.List;

/*@author:lihang
 *@email:631533483@qq.com */

@Elasticsearch
public interface UserSenior {
    List<User> findSenior(User user);
    List<User> findSeniorTest(User user);
}
