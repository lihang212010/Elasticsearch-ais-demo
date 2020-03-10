package com.ais.demo.entity;

/*@author:lihang
 *@email:631533483@qq.com */

import java.util.Date;

public class User {

    private String name;
    private Integer age;
    private Date date;
    private String lover;
    private String id;
    private String worker;
    private String company;
    private String title;
    private String position;
    private boolean health;
    private Integer pageSize;
    private Integer pageFrom;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLover() {
        return lover;
    }

    public void setLover(String lover) {
        this.lover = lover;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    public Integer getPageFrom() {
        return pageFrom;
    }

    public void setPageFrom(Integer pageFrom) {
        this.pageFrom = pageFrom;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", lover='" + lover + '\'' +
                ", id='" + id + '\'' +
                ", worker='" + worker + '\'' +
                ", company='" + company + '\'' +
                ", title='" + title + '\'' +
                ", position='" + position + '\'' +
                ", health=" + health +
                ", pageSize=" + pageSize +
                ", pageFrom=" + pageFrom +
                '}';
    }
}
