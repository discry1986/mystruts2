<%@ taglib prefix="s" uri="/struts-tags" %>
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
    <title>ognl 静态变量</title>
    PI = <s:property value="@java.lang.Math@PI"></s:property>
    RandomNum = <s:property value="@java.lang.Math@random()"></s:property>
    <form action="/mystruts2/nine_ognl/ognlAction.php" method="post">
        <button type="submit">提交 </button>
    </form>
    <s:debug></s:debug>
</head>
<body>

</body>
</html>
