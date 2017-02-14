package com.discry.struts2.actions.five_ReceiveObject;

/**
 * Created by Zhoujp1 on 2016-11-19.
 */
public class LoginAction {

    private User user;

    public User getUser() {
        System.out.println("getUser()" + user);
        return user;
    }

    public void setUser(User user) {
        System.out.println("setUser()"+  user);
        this.user = user;
    }

    public String login() {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "success";
    }
}
