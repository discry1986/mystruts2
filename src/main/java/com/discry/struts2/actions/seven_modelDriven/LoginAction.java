package com.discry.struts2.actions.seven_modelDriven;

import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by Zhoujp1 on 2016-11-19.
 */
public class LoginAction implements ModelDriven<User>{

    private User user;

    public User getUser() {
        System.out.println("getUser()" + user);
        return user;
    }

    public void setUser(User user) {
        System.out.println("setUser()"+  user);
        this.user = user;
    }

    public User getModel() {
        if(user == null){
            user = new User();
        }
        return user;
    }

    public String login() {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "success";
    }
}
