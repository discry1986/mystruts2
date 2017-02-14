<%--
  Created by IntelliJ IDEA.
  User: Zhoujp1
  Date: 2016-11-19
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
    <table>
        <tr><td>恭喜${user[0].username}登录成功！</td><td>name = ${requestScope.user[0].username}</td><td>password = ${requestScope.user[0].password}</td></tr>
        <tr><td>恭喜${user[1].username}登录成功！</td><td>name = ${requestScope.user[1].username}</td><td>password = ${requestScope.user[1].password}</td></tr>
    </table>

</body>
</html>
