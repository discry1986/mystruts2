package com.discry.struts2.actions.fourteen_interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import org.apache.struts2.ServletActionContext;

/**
 * Created by Zhoujp1 on 2017-01-23.
 */
public class PermissionInterceptor implements Interceptor {
    public void destroy() {

    }

    public void init() {

    }

    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("拦截: "+actionInvocation.getAction());
        Object user = ServletActionContext.getRequest().getSession().getAttribute("user");
        if(user == null){
            return "input";
        }
        return actionInvocation.invoke();
    }
}
