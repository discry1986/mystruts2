package com.discry.struts2.actions.thirteen_validate;

/**
 * Created by Zhoujp1 on 2017-01-22.
 */
public class User {
    private String mobile;
    private String email;
    private String pwd;
    private String repwd;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
