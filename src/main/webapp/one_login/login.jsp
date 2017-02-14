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
    <form action="/mystruts2/one_login/login.php" method="post">
        <table>
            <tr>
                <td>用户名</td><td><input type="text" name="username"/></td>
            </tr>
            <tr>
                <td>密码</td><td><input type="password" name="password"/></td>
            </tr>
            <tr><td colspan="2"><input type="submit" value="登录"/></td></tr>
        </table>
    </form>
</body>
</html>
