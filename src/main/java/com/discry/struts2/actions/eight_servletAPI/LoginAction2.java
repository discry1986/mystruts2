package com.discry.struts2.actions.eight_servletAPI;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ognl.accessor.ObjectAccessor;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Zhoujp1 on 2016-11-19.
 */
public class LoginAction2 implements RequestAware,SessionAware,ApplicationAware{

    private Map<String,Object> myapplication; //成员变量，非Acton中的属性
    private Map<String,Object> mySession;
    private Map<String,Object> myRequest;

    public void setApplication(Map<String, Object> application) {
        this.myapplication = application;
    }

    public void setRequest(Map<String, Object> request) {
        this.myRequest = request;
    }

    public void setSession(Map<String, Object> session) {
        this.mySession = session;
    }

    public String login(){
        myRequest.put("req","request_value");
        mySession.put("ses","session_value");
        myapplication.put("app","application_value");
        return  "success";
    }
}
