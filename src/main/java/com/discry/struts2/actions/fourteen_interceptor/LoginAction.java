package com.discry.struts2.actions.fourteen_interceptor;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Zhoujp1 on 2017-01-23.
 */
public class LoginAction extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String home(){
        System.out.println("-->执行Action");
        return SUCCESS;
    }
}
