package com.discry.struts2.actions.nine_ognl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;

import java.util.Map;

/**
 * Created by Zhoujp1 on 2016-11-19.
 */
public class LoginAction {
    public String login1() {
        ValueStack valueStack = (ValueStack)ServletActionContext.getRequest().getAttribute(ServletActionContext.STRUTS_VALUESTACK_KEY);
        Map<String, Object> context1 = valueStack.getContext();
        context1 .put("TestKey","TestValue");
        ActionContext context2 = ActionContext.getContext();
        System.out.println(context2.get("TestKey"));
        System.out.println(ActionContext.getContext().getValueStack()==valueStack);
        return "success";
    }
}
