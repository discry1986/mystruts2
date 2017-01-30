<%--
  Created by IntelliJ IDEA.
  User: Zhoujp1
  Date: 2017-01-22
  Time: 12:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>validate</title>
</head>
<body>
    loginAction_regedit.action<br>
    <s:form action="/mystruts2/thirteen_validate/loginAction_regedit.php" method="POST">
        <s:textfield name="mobile" label="电话"></s:textfield>
        <s:textfield name="email" label="邮箱"></s:textfield>
        <s:submit label="注册"></s:submit>
    </s:form>
    loginAction_login.action<br>
    <s:form action="/mystruts2/thirteen_validate/loginAction_login.php" method="POST">
        <s:textfield name="mobile" label="电话"></s:textfield>
        <s:textfield name="email" label="邮箱"></s:textfield>
        <s:submit label="注册"></s:submit>
    </s:form>
    regeditAction_login.action<br>
    <s:form action="/mystruts2/thirteen_validate/regeditAction_login.php" method="POST">
        <s:textfield name="mobile" label="电话"></s:textfield>
        <s:textfield name="email" label="邮箱"></s:textfield>
        <s:submit label="注册"></s:submit>
    </s:form>
    regeditAction_regedit.action<br>
    <s:form action="/mystruts2/thirteen_validate/regeditAction_regedit.php" method="POST">
        <s:textfield name="mobile" label="电话"></s:textfield>
        <s:textfield name="email" label="邮箱"></s:textfield>
        <s:password name="pwd" label="密码"></s:password>
        <s:password name="repwd" label="确认密码"></s:password>
        <s:submit label="注册"></s:submit>
    </s:form>
    regeditNewAction_regedit.action<br>
    <s:form action="/mystruts2/thirteen_validate/regeditNewAction_regedit.php" method="POST">
        <s:textfield name="user.mobile" label="电话"></s:textfield>
        <s:textfield name="user.email" label="邮箱"></s:textfield>
        <s:password name="user.pwd" label="密码"></s:password>
        <s:password name="user.repwd" label="确认密码"></s:password>
        <s:submit label="注册"></s:submit>
    </s:form>
</body>
</html>
