package com.ais.demo.controller;

/*@author:lihang
 *@email:631533483@qq.com */

import com.elasticsearch.ais.Estemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
 *@author:lihang
 *@email:631533483@qq.com
 *这个类的主要作用是演示Estemplate的修改使用
 * The main purpose of this class is to demonstrate the modified use of estemplate
 */

@RestController
public class Update {

    private String index="demo";
    @Autowired
    Estemplate estemplate;

    @RequestMapping("/update")
    public void update(String id, Map<String,Object> map,String index) throws IOException {
        estemplate.update(id,map,index);
    }

    @RequestMapping("/update1")
    public void update1(Map<String,Map<String,Object>> map,String index) throws IOException {
        estemplate.update(map,index);
    }

    @RequestMapping("/update_by_query")
    public void update_by_query() throws IOException {
        estemplate.wildcard("name","李");
        Map<String,String> map=new HashMap();
        map.put("title","We are good friends. Our friendship will last forever");
        estemplate.update_by_query(map,index);
    }



}

