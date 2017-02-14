package com.discry.struts2.actions.ten_valueStack;

import com.opensymphony.xwork2.ActionContext;

import java.util.HashMap;
import java.util.Map;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by Zhoujp1 on 2016-12-07.
 */
public class LoginAction {

    private int age;

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //向root中显式放入数据
    public String login(){
        Student stu = new Student(student.getName(),student.getPassword());
        //将数据直接放入值栈
        ActionContext.getContext().getValueStack().push(stu);
        //将数据放入值栈的root
        ActionContext.getContext().getValueStack().getRoot().push(new Student("zhoujp1","Aa123456"));
        Map map = new HashMap<String, Object>();
        map.put("stu3", new Student("yutl1", "ddmm"));
        //将有名Map放入值栈
        ActionContext.getContext().getValueStack().push(map);
        //使用值栈的Set方法，放入值栈对象
        ActionContext.getContext().getValueStack().set("stu4",new Student("李四","Ls123456"));
        return SUCCESS;
    }

    //向Context中显式放入数据
    public String login2(){
        ActionContext.getContext().put("stu5",new Student("王五","HD001"));
        ActionContext.getContext().getApplication().put("app","app_value");
        ActionContext.getContext().getApplication().put("app_session","app_value1");
        ActionContext.getContext().getSession().put("app_session","session_value1");
        return SUCCESS;
    }

    //root数据加载顺序
    public String login3(){
        ActionContext.getContext().getValueStack().set("person","Root_张三");
        //ActionContext.getContext().put("person","Context_张三");
        ActionContext.getContext().getSession().put("person","Context_李四");
        return "test";
    }

}
