package com.discry.struts2.actions.fifteen_MethodInterceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.bind.v2.TODO;
import org.apache.struts2.ServletActionContext;

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

    public String privateHome(){
        System.out.println("-->privateHome()");

        return SUCCESS;
    }

    public String publicHome(){
        System.out.println("-->publicHome()");

        return SUCCESS;
    }

    public  String login(){
        User loginUser = new User();
        loginUser.setName(user.getName());
        loginUser.setPwd(user.getPwd());
        //TODO:验证用户名和密码
        ActionContext.getContext().getSession().put("user",loginUser);
        return "home";
    }

    public String logoff(){
        ServletActionContext.getRequest().getSession().removeAttribute("user");
        return "home";
    }

}
