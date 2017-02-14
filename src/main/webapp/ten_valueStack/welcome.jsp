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
            <td>显式放入valueStack</td>
            <td>name = <s:property value="name"></s:property> password = <s:property value="password"></s:property></td>
            <td>student3 = <s:property value="stu3"></s:property></td>
            <td>student4 = <s:property value="stu4"></s:property></td>
        </tr>
        <tr>
            <td>显式放入valueStack $ {}方式</td>
            <td>name = ${name} password = ${password}</td>
            <td>student3 = ${stu3}</td>
            <td>student4 = ${stu4}</td>
        </tr>
        <tr>
            <td>显式放入valueStack</td>
            <td>student.name = ${student.name}</td>
            <td>student.password = ${student.password}</td>
            <td></td>
        </tr>
        <tr>
            <td>取ActionContext的显式值</td>
            <td>#stu5 = <s:property value="#stu5"></s:property> </td>
            <td>#stu5.name = <s:property value="#stu5.name"></s:property> </td>
            <td>#stu5.password = <s:property value="#stu5.password"></s:property></td>
        </tr>
        <tr>
            <td>attr取ActionContext的值</td>
            <td>#application.app = <s:property value="#application.app"></s:property> </td>
            <td>#application.app_session = <s:property value="#application.app_session"></s:property> </td>
            <td>#attr.app_session = <s:property value="#attr.app_session"></s:property></td>
        </tr>
        <tr>
            <td>取ActionContext隐式的值</td>
            <td>student.name = <s:property value="student.name"></s:property> </td>
            <td>#action.student.name = <s:property value="#action.student.name"></s:property> </td>
            <td>
                #parameters.student.name = <s:property value="#parameters.student.name"></s:property>
                #parameters.age = <s:property value="#parameters.age"></s:property>
            </td>
        </tr>
    </table>
    <s:debug></s:debug>
</body>
</html>
