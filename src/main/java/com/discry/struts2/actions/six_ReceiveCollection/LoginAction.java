package com.discry.struts2.actions.six_ReceiveCollection;

import java.util.List;

/**
 * Created by Zhoujp1 on 2016-11-19.
 */
public class LoginAction {

    private List<User> user;

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public String login() {
        return "success";
    }
}
