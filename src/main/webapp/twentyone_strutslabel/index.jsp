<%--
  Created by IntelliJ IDEA.
  User: Zhoujp1
  Date: 2017-02-07
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>annotation登录页面</title>
</head>
<body>
    result type = dispatcher
    <s:form method="post" action="/mystruts2/twentyone_strutslabel/loginAction.php">
        <s:textfield name="username" label="用户名"></s:textfield>
        <s:password name="password" label="密码-"></s:password>
        <s:submit value="登录"></s:submit>
    </s:form>

    result type = redirectAction
    <s:form method="post" action="/mystruts2/twentyone_strutslabel/loginAction2.php">
        <s:textfield name="username" label="用户名"></s:textfield>
        <s:password name="password" label="密码-"></s:password>
        <s:submit value="登录"></s:submit>
    </s:form>
</body>
</html>
