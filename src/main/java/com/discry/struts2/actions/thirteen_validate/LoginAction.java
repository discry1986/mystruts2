package com.discry.struts2.actions.thirteen_validate;

import com.opensymphony.xwork2.ActionSupport;

import java.util.regex.Pattern;

/**
 * Created by Zhoujp1 on 2017-01-22.
 */
public class LoginAction extends ActionSupport {
    private String email;
    private String mobile;

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

    public void validateRegedit() {
        if(!Pattern.matches("^1[34578]\\d{9}$",mobile)){
            this.addFieldError("mobile","手机格式错误");
        }else if(!Pattern.matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$",email)){
            this.addFieldError("email","邮箱格式不正确");
        }
        super.validate();
    }

    public String regedit(){
        return SUCCESS;
    }

    public String login(){
        return SUCCESS;
    }
}

