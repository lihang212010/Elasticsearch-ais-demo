package com.ais.demo.controller.find;

import com.ais.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.elasticsearch.ais.Estemplate;
import org.springframework.boot.elasticsearch.ais.staticString.Find;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/*@author:lihang
 *@email:631533483@qq.com
 *这个类的主要作用是演示Estemplate的查询使用
 *The main purpose of this class is to demonstrate the query use of estemplate
 *  */
@RestController
public class Finds {


    @Autowired
    Estemplate estemplate;

    private String index="demo";


    /*
    * 这个查询为age在10和48之间,但不在22-24的，name首字母为李的，title中含有are，worker是Teacher或者Doctor的从0位开始到第20位
    * */
    @RequestMapping("find1")
    public List<User> find1() throws IOException {
        estemplate.range("age",10,48);
        estemplate.range("must_not","age",22,24);
        estemplate.prefix("name","李");
        estemplate.wildcard("title","are");
        estemplate.terms("worker","Teacher","Doctor");
        estemplate.from(0);
        estemplate.size(20);
        return estemplate.execute(index,User.class);
    }

    /*
    * 姓名是张三或者liu的age大于20的
    * */
    @RequestMapping("find2")
    public List<User> find2() throws IOException {
        estemplate.script("doc['age']>20");
        estemplate.should(1, Find.term("name","张三"), Find.term("name","liu"));
        estemplate.from(0);
        estemplate.size(20);
        return estemplate.execute(index,User.class);
    }






}
