package com.ais.demo.controller.find;

import com.ais.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.elasticsearch.ais.Estemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/*@author:lihang
 *@email:631533483@qq.com
 * 这个类的主要作用是演示Estemplate的查询模块使用方法
 *The main purpose of this class is to demonstrate how to use the query module of estemplate
 * */
@RestController
public class Finddemo {

    @Autowired
    Estemplate estemplate;

    private String index = "demo";

    @RequestMapping("wildcard")
    public List<User> wildcard() throws IOException {
        estemplate.wildcard("name", "曹");
        return estemplate.execute(index, User.class);
    }

    @RequestMapping("term")
    public List<User> term() throws IOException {
        estemplate.term("name.keyword", "奚范");
        return estemplate.execute(index, User.class);
    }


    @RequestMapping("match")
    public List<User> match() throws IOException {
        estemplate.match("name", "奚范");
        return estemplate.execute(index, User.class);
    }

    @RequestMapping("terms")
    public List<User> terms() throws IOException {
        estemplate.terms("age", 25, 35, 10, 68);
        return estemplate.execute(index, User.class);
    }

    @RequestMapping("match_phrase")
    public List<User> match_phrase() throws IOException {
        estemplate.match_phrase("title", "We friends", 2);
        return estemplate.execute(index, User.class);
    }


    @RequestMapping("match_phrase_prefix")
    public List<User> match_phrase_prefix() throws IOException {
        estemplate.match_phrase_prefix("title", "We are good f", 10);
        return estemplate.execute(index, User.class);
    }

    @RequestMapping("common")
    public List<User> common() throws IOException {
        estemplate.common("title", "We are", 0.01);
        return estemplate.execute(index, User.class);
    }

    @RequestMapping("exits")
    public List<User> exits() throws IOException {
        estemplate.exits("title");
        return estemplate.execute(index, User.class);
    }


    @RequestMapping("fuzzy")
    public List<User> fuzzy() throws IOException {
        estemplate.fuzzy("name", "李松", 1);
        return estemplate.execute(index, User.class);
    }


    @RequestMapping("ids")
    public List<User> ids() throws IOException {
        estemplate.ids("09EprnABqEAuwq_e8YJH", "19EprnABqEAuwq_e8YJH");
        return estemplate.execute(index, User.class);
    }


    @RequestMapping("multi_match")
    public List<User> multi_match() throws IOException {
        estemplate.multi_match("are", "name", "title");
        return estemplate.execute(index, User.class);
    }

    @RequestMapping("more_like_this")
    public List<User> more_like_this() throws IOException {
        estemplate.more_like_this(1, 10, "are", "title");
        return estemplate.execute(index, User.class);
    }


    @RequestMapping("prefix")
    public List<User> prefix() throws IOException {
        estemplate.prefix("name", "李");
        return estemplate.execute(index, User.class);
    }


    @RequestMapping("query_string")
    public List<User> query_string() throws IOException {
        estemplate.query_string("name", "(孙李) OR (李周)");
        return estemplate.execute(index, User.class);
    }


    @RequestMapping("range")
    public List<User> range() throws IOException {
        estemplate.range("age", 10, 100);
        return estemplate.execute(index, User.class);
    }


    @RequestMapping("regexp")
    public List<User> regexp() throws IOException {
        estemplate.regexp("name", "孙.?");
        return estemplate.execute(index, User.class);
    }


    @RequestMapping("script")
    public List<User> script() throws IOException {
        estemplate.script("doc['age']>10");
        return estemplate.execute(index, User.class);
    }

    @RequestMapping("findFree")
    public List<User> findFree() throws IOException {
        String query = "{\n" +
                "    \"term\": {\n" +
                "      \"name.keyword\": {\n" +
                "        \"value\": \"奚范\"\n}" +
                "      }\n" +
                "    }";
        estemplate.findFree(query);
        return estemplate.execute(index, User.class);
    }


}
