<%--
  Created by IntelliJ IDEA.
  User: Zhoujp1
  Date: 2017-01-23
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>模拟退出登录</title>
</head>
<body>
    <%session.removeAttribute("user");%>用户注销成功！
</body>
</html>
