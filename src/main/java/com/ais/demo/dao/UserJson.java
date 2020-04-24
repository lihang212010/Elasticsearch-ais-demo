package com.ais.demo.dao;

import com.ais.demo.entity.User;


import java.util.List;
import org.springframework.boot.elasticsearch.ais.annotation.Elasticsearch;

/*@author:lihang
 *@email:631533483@qq.com */
@Elasticsearch
public interface UserJson {
    List<User> findName(String name);
    List<User> findIdName(String name,String id);
}
