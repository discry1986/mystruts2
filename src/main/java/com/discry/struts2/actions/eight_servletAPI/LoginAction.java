package com.discry.struts2.actions.eight_servletAPI;

import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Zhoujp1 on 2016-11-19.
 */
public class LoginAction{
    public String login1() {
        //这三个对象为一个Map<String,Object>，该map可以操作相应的ServletAPI的域空间。
        //放入Request中
        //在request域中放入属性req：暂且认为getContext()获取到的是request域空间，但实际并不是
        ActionContext.getContext().put("req","req_value");
        //放入Session中
        ActionContext.getContext().getSession().put("ses","ses_value");
        //放入Application
        ActionContext.getContext().getApplication().put("app","app_value");
        return "success";
    }

    public String login2() {
        //放入Request中
        HttpServletRequest request =ServletActionContext.getRequest();
        request.setAttribute("req","req_value");
        //放入Session中
        request.getSession().setAttribute("ses","ses_value");
        //放入Application
        ServletActionContext.getServletContext().setAttribute("app","app_value");
        return "success";
    }
}
