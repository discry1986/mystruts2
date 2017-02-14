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

<form action="/mystruts2/ten_valueStack/loginAction_login.php" method="post">
    root（StackValue)
    <table>
        <th><td colspan="2">用户登录</td></th>
        <tr><td>用户名</td><td><input type="text" name="student.name"/></td></tr>
        <tr><td>密码</td><td><input type="password" name="student.password"/></td></tr>
        <tr><td cospan="2"><input type="submit" value="登录"/></td></tr>
    </table>
</form>
<form action="/mystruts2/ten_valueStack/loginAction_login2.php" method="post">
    Context
    <table>
        <th><td colspan="2">用户登录</td></th>
        <tr><td>用户名</td><td><input type="text" name="student.name"/></td></tr>
        <tr><td>密码</td><td><input type="password" name="student.password"/></td></tr>
        <tr><td>年龄</td><td><input type="text" name="age"></td></tr>
        <tr><td cospan="2"><input type="submit" value="登录"/></td></tr>
    </table>
</form>
<form action="/mystruts2/ten_valueStack/loginAction_login3.php" method="post">
    root中数据加载顺序
    <table>
        <tr><td cospan="2"><input type="submit" value="test"/></td></tr>
    </table>
</form>
</body>
</html>
