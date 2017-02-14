package com.discry.struts2.actions.fifteen_MethodInterceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

/**
 * Created by Zhoujp1 on 2017-01-24.
 */
public class PermissionMethodInterceptor extends MethodFilterInterceptor {
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        System.out.printf("-->调用拦截器:PermissionMethodInterceptor");
        Object user = ServletActionContext.getRequest().getSession().getAttribute("user");
        if(user==null) return "input";
        return actionInvocation.invoke();
    }
}
