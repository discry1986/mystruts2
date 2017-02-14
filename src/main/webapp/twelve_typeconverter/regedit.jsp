<%--
  Created by IntelliJ IDEA.
  User: Zhoujp1
  Date: 2017-01-21
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>regedit</title>
</head>
<body>
    html 标签
    <form method="post" action="/mystruts2/twelve_typeConverter/regeditAction.php">
        姓名：<input type="text" name="name"><br>
        年龄：<input type="text" name="age"><br>
        生日：<input type="text" name="birthday"><br>
        <button type="submit">注册</button>
    </form>
    Struts2 标签
    <s:form method="post" action="/mystruts2/twelve_typeConverter/RegeditAction.php">
        <s:textfield name="name" label="姓名"></s:textfield>
        <s:textfield name="age" label="年龄"></s:textfield>
        <s:textfield name="birthday" label="生日"></s:textfield>
        <s:submit label="注册"></s:submit>
    </s:form>
</body>
</html>
