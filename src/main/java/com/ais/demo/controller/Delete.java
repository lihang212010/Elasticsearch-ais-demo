package com.ais.demo.controller;

import com.elasticsearch.ais.Estemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/*@author:lihang
 *@email:631533483@qq.com
 *这个类的主要作用是演示Estemplate的删除使用
 * The main purpose of this class is to demonstrate the deletion and use of estemplate
 * */
@RestController
public class Delete {

    @Autowired
    Estemplate estemplate;

    @RequestMapping("/delete")
    public void delete(String index,String id) throws IOException {
        estemplate.delete(index,id);
    }

    @RequestMapping("/delete1")
    public void delete(String index,String ...id) throws IOException {
        estemplate.delete(index,id);
    }

    @RequestMapping("delete_query")
    public void delete_query() throws IOException {
        estemplate.term("age","10");
        estemplate.delete_by_query("demo");
    }
}
