<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Zhoujp1
  Date: 2017-02-07
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎使用annotation标签</title>
</head>
<body>
<table>
    <tr><td>恭喜${username}登录成功！</td><td>requestScope.username = ${requestScope.username}</td></tr>
    <tr><td>恭喜${param.username}登录成功！</td><td>param.username = ${param.username}</td></tr>
</table>
</body>
</html>
