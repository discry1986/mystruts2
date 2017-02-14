package com.discry.struts2.actions.sixteen_InterceptorOrder;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by Zhoujp1 on 2017-01-31.
 */
public class SomeAction {
    public String execute(){
        System.out.println("执行Action，进入系统...");
        return SUCCESS;
    }
}
