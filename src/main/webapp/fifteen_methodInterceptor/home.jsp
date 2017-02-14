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
    <s:if test="#session.user==null">
        <s:form action="/mystruts2/fifteen_MethodInterceptor/loginAction_login.php" method="POST">
            <s:textfield label="用户名" name="user.name"></s:textfield>
            <s:password label="密码" name="user.pwd"></s:password>
            <s:submit label="登录"></s:submit>
        </s:form>
    </s:if>
    <s:else>
        欢迎${user.name}访问Struts2系统，<a href="/mystruts2/fifteen_MethodInterceptor/loginAction_logoff.php">退出系统</a>
    </s:else>
    <a href="/mystruts2/fifteen_MethodInterceptor/loginAction_privateHome.php">个人页面</a>
    <a href="/mystruts2/fifteen_MethodInterceptor/loginAction_publicHome.php">公开页面</a>

    <s:debug></s:debug>
</body>
</html>
