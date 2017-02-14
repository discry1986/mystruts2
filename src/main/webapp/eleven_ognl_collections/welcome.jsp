<%--
  Created by IntelliJ IDEA.
  User: Zhoujp1
  Date: 2016-11-19
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
    <table bgcolor="#7fffd4" border="1">
        <tr>
            <td>使用ognl创建和输出List</td>
            <!-- 通过set定义的变量，会放入context -->
            <s:set value="{'dd','mm','zhoujp'}" name="users"></s:set>
            <td>
                <s:iterator value="#users" status="status"> <!--会将当前迭代的对象放入值栈栈顶-->
                    users[${status.index+1}] =  <s:property></s:property>
                </s:iterator>
            </td>
        </tr>
        <tr>
            <td>使用ognl输出Map 方式一</td>
            <td>
                <s:iterator value="maps">
                    <s:property></s:property>
                </s:iterator>
            </td>
        </tr>
        <tr>
            <td>使用ognl输出Map 方式二</td>
            <td>
                <s:iterator value="maps" var="e">
                    <s:property value="e"></s:property>
                </s:iterator>
            </td>
        </tr>
        <tr>
            <td>使用ognl输出Map 方式三</td>
            <td>
                <s:iterator value="maps">
                    <s:property value="key"></s:property> = <s:property value="value"></s:property>
                </s:iterator>
            </td>
        </tr>
        <tr>
            <td>元素的存在性判断</td>
            <td>
                <s:property value="'dd' in #users"></s:property>
                <s:property value="'dd' not in #users"></s:property>
            </td>
        </tr>
        <tr>
            <td>标签定义三个对象</td>
            <td>
                <!-- 该Student会放入Context -->
                <s:bean name="com.discry.struts2.actions.eleven_ognl_collections.Student" id="stu1">
                    <!-- 注意这里的value若为String字符串，则需要单引号括起来 -->
                    <s:param name="name" value="'zhoujp1'"></s:param>
                    <s:param name="age" value="30"></s:param>
                </s:bean>
                <s:bean name="com.discry.struts2.actions.eleven_ognl_collections.Student" id="stu2">
                    <s:param name="name" value="'dd'"></s:param>
                    <s:param name="age" value="3"></s:param>
                </s:bean>
                <s:bean name="com.discry.struts2.actions.eleven_ognl_collections.Student" id="stu3">
                    <s:param name="name" value="'mm'"></s:param>
                    <s:param name="age" value="2"></s:param>
                </s:bean>

                <s:set value="{#stu1,#stu2,#stu3}" name="stus"></s:set>
                <s:iterator value="#stus">
                    <s:property></s:property>
                </s:iterator>
            </td>
        </tr>
        <tr>
            <td>集合的投影</td>
            <td>
                <s:set value="#stus.{name}" name="studentNames"></s:set>
                <s:iterator value="#studentNames">
                    <s:property></s:property>
                </s:iterator>
            </td>
        </tr>
        <tr>
            <td>集合的查询</td>
            <td>
                <!-- 查询年龄小于5岁的所有学生 -->
                <s:iterator value="#stus.{?#this.age<5}">
                    <s:property></s:property>
                </s:iterator>
                <!-- 查询年龄小于5岁的第一个学生 -->
                <s:iterator value="#stus.{^#this.age<5}">
                    <s:property></s:property>
                </s:iterator>
            </td>
        </tr>
    </table>
    <s:debug></s:debug>
</body>
</html>
