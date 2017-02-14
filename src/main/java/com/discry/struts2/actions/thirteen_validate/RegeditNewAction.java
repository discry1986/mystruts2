package com.discry.struts2.actions.thirteen_validate;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Zhoujp1 on 2017-01-22.
 */
public class RegeditNewAction extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String regedit(){
        return SUCCESS;
    }
}
