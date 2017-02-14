package com.discry.struts2.actions.twelve_typeconverter;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;


/**
 * Created by Zhoujp1 on 2017-01-21.
 */
public class RegeditAction extends ActionSupport{
    private String name;
    private int age;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String regedit(){
        System.out.println("name = "+name);
        System.out.println("age = "+age);
        System.out.println("birthday = "+birthday);
        return "success";
    }
}
