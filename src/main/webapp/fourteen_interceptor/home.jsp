<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Zhoujp1
  Date: 2017-01-23
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home主页</title>
</head>
<body>
    <s:form action="/mystruts2/fourteen_interceptor/loginAction_login.php" method="POST">
        <s:textfield label="用户名" name="user.name"></s:textfield>
        <s:password label="密码" name="user.pwd"></s:password>
        <s:submit label="登录"></s:submit>
    </s:form>
    <a href="login.jsp">登录系统</a>
    <a href="logoff.jsp">退出系统</a>
    <a href="/mystruts2/fourteen_interceptor/loginAction_home.php">home</a>
</body>
</html>
