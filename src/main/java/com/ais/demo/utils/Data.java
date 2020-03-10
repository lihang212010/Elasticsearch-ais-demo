package com.ais.demo.utils;

/*@author:lihang
 *@email:631533483@qq.com */

import com.ais.demo.entity.User;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;



/*
* 这个类的主要作用是插入足够多的测试数据
* */
public class Data {

    private String name="打是否你看发啊但是啊但是说法安抚啊赵钱孙李周吴郑王冯陈褚卫蒋沈韩杨朱秦尤许何吕施张孔曹严华金魏陶姜戚谢邹喻柏水窦章云苏潘葛奚范彭郎。鲁韦昌马苗凤花方俞任袁柳酆鲍史唐费廉岑薛雷贺倪汤殷罗毕郝邬安常公司张里还是那我阿斯顿测试测试阿森纳机会但是金卡是比较看";
    private String []worker={"Farmer","Doctor","Teacher","Police","Scientist","Salesman"};

    public User getUser(){
        int i= new Random().nextInt(88);
        int j= new Random().nextInt(88);
        String id=new Random().nextInt(10)+""+new Random().nextInt(10)+new Random().nextInt(10)+new Random().nextInt(10)+new Random().nextInt(10)+new Random().nextInt(10)+"";
        String posttion=new Random().nextInt(10)+""+new Random().nextInt(10)+new Random().nextInt(10)+new Random().nextInt(10)+new Random().nextInt(10)+new Random().nextInt(10)+"";
        User user=new User();
        user.setName(name.substring(i,i+2));
        user.setAge(new Random().nextInt(100));
        user.setDate(getNowDate());
        user.setLover(name.substring(i+3,i+5));
        user.setDate(new Date());
        user.setId(id);
        user.setWorker(worker[new Random().nextInt(6)]);
        user.setCompany(name.substring(j,j+4));
        user.setTitle(name.substring(j,j+4));
        user.setHealth(true);
        user.setPosition(posttion);
        return user;
    }

    public List<User> getListUser(){
        List<User> list=new ArrayList<>();
        for(int i=0;i<=3000;i++){
            list.add(this.getUser());
        }
        return list;
    }


    public  Date getNowDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        ParsePosition pos = new ParsePosition(8);
        Date currentTime_2 = formatter.parse(dateString, pos);
        return currentTime_2;
    }


}


