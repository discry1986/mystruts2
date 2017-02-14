package com.discry.struts2.actions.thirteen_validate;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Zhoujp1 on 2017-01-22.
 */
public class RegeditAction extends ActionSupport {
    private String email;
    private String mobile;
    private String pwd;
    private String repwd;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRepwd() {
        return repwd;
    }

    public void setRepwd(String repwd) {
        this.repwd = repwd;
    }

    public String regedit(){
        return SUCCESS;
    }

    public String login(){
        return SUCCESS;
    }
}
