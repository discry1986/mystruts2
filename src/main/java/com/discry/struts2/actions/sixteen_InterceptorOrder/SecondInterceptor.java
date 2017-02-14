package com.discry.struts2.actions.sixteen_InterceptorOrder;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created by Zhoujp1 on 2017-01-31.
 */
public class SecondInterceptor implements Interceptor {
    public void destroy() {

    }

    public void init() {

    }

    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("执行第二个拦截器");
        return actionInvocation.invoke();
    }
}
