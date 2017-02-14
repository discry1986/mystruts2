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
type=dispatcher
<form action="/mystruts2/two_resultType/login.php" method="post">
    <table>
        <th><td colspan="2">用户登录</td></th>
        <tr><td>用户名</td><td><input type="text" name="username"/></td></tr>
        <tr><td>密码</td><td><input type="password" name="password"/></td></tr>
        <tr><td cospan="2"><input type="submit" value="登录"/></td></tr>
    </table>
    <a href="/mystruts2/two_resultType/toRegister.php">注册用户</a>
</form>
type=redirect
<form action="/mystruts2/two_resultType/login1.php" method="post">
    <table>
        <th><td colspan="2">用户登录</td></th>
        <tr><td>用户名</td><td><input type="text" name="username"/></td></tr>
        <tr><td>密码</td><td><input type="password" name="password"/></td></tr>
        <tr><td cospan="2"><input type="submit" value="登录"/></td></tr>
    </table>
    <a href="/mystruts2/two_resultType/toRegister.php">注册用户</a>
</form>
type=redirectAction
<form action="/mystruts2/two_resultType/login2.php" method="post">
    <table>
        <th><td colspan="2">用户登录</td></th>
        <tr><td>用户名</td><td><input type="text" name="username"/></td></tr>
        <tr><td>密码</td><td><input type="password" name="password"/></td></tr>
        <tr><td cospan="2"><input type="submit" value="登录"/></td></tr>
    </table>
    <a href="/mystruts2/two_resultType/toRegister.php">注册用户</a>
</form>
type=chain
<form action="/mystruts2/two_resultType/login3.php" method="post">
    <table>
        <th><td colspan="2">用户登录</td></th>
        <tr><td>用户名</td><td><input type="text" name="username"/></td></tr>
        <tr><td>密码</td><td><input type="password" name="password"/></td></tr>
        <tr><td cospan="2"><input type="submit" value="登录"/></td></tr>
    </table>
    <a href="/mystruts2/two_resultType/toRegister.php">注册用户</a>
</form>
</body>
</html>
