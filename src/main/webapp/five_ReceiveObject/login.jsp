<%--
  Created by IntelliJ IDEA.
  User: Zhoujp1
  Date: 2016-11-19
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="/mystruts2/five_ReceiveObject/loginAction.php" method="post">
    <table>
        <th><td colspan="2">用户登录</td></th>
        <tr><td>用户名</td><td><input type="text" name="user.username"/></td></tr>
        <tr><td>密码</td><td><input type="password" name="user.password"/></td></tr>
        <tr><td cospan="2"><input type="submit" value="登录"/></td></tr>
    </table>
</form>
</body>
</html>
