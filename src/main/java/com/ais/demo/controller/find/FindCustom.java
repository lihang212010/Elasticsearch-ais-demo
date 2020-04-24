package com.ais.demo.controller.find;

import com.ais.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.elasticsearch.ais.EstemplateCustom;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/*@author:lihang
 *@email:631533483@qq.com
 *这个类的主要作用是演示EstemplateCustom的使用方式
 *The main purpose of this class is to demonstrate the use of estemplatecustom
 * */
@RestController
public class FindCustom {

    @Autowired
    EstemplateCustom estemplateCustom;

    @RequestMapping("/findCustom")
    public List<User>  findCustom(User user) throws IllegalAccessException, NoSuchFieldException, IOException {
        String script="GET demo/_search\n" +
                "{\n" +
                "  \"query\": {\n" +
                "    \"bool\": {\n" +
                "      \"must\": [\n" +
                "        {\n" +
                "          \"wildcard\": {\n" +
                "            \"name\": {\n" +
                "              \"value\": \"#{name}\"\n" +
                "            }\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"term\": {\n" +
                "            \"id\": {\n" +
                "              \"value\": \"#{id}\"\n" +
                "            }\n" +
                "          }\n" +
                "        }\n" +
                "      ],\n" +
                "      \"must_not\": [\n" +
                "        {\n" +
                "          \"range\": {\n" +
                "            \"age\": {\n" +
                "              \"gte\": #{age}\n" +
                "            }\n" +
                "          }\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  },\n" +
                "  \"from\": \"#{pageFrom}\",\n" +
                "  \"size\": \"#{pageSize}\"\n" +
                "}";
       return estemplateCustom.excute(script,user);
    }

}
