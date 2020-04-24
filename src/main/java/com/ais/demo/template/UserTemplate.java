package com.ais.demo.template;

/*@author:lihang
 *@email:631533483@qq.com
 * ais的模板使用
 *Template usage of AIS
 *  */

import com.ais.demo.entity.User;
import org.springframework.boot.elasticsearch.ais.template.POJOTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserTemplate extends POJOTemplate<User> {

    /*
    * 设置索引
    * */
    @Override
    public void setIndex() {
        this.index="demo";
    }
    /*
    * 设置分页等属性
    * */
    @Override
    public void setConfig(User entity) {
       estemplate.from(entity.getPageFrom());
       estemplate.size(entity.getPageSize());
    }

    /*
    * 设置可以通过id和name进行查询
    * */
    @Override
    public void findRule(User user) {
        estemplate.term("id",user.getId());
        estemplate.wildcard("name.keyword",user.getName());
    }

//    /*
//    * 设置的只可以使用id进行删除
//    * */
//    @Override
//    public void deleteRule(User user){
//        estemplate.term("id",user.getId());
//    }
//
//    /*
//     * 设置的只可以使用name进行修改
//     * */
//    @Override
//    public void updateRule(User user){
//        estemplate.term("name",user.getId());
//    }

}
