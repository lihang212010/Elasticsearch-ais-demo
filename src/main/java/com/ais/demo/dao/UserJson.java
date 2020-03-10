package com.ais.demo.dao;

import com.ais.demo.entity.User;
import com.elasticsearch.ais.annotation.Elasticsearch;

import java.util.List;

/*@author:lihang
 *@email:631533483@qq.com */
@Elasticsearch
public interface UserJson {
    List<User> findName(String name);
    List<User> findIdName(String name,String id);
}
