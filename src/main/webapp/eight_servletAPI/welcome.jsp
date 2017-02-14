<%--
  Created by IntelliJ IDEA.
  User: Zhoujp1
  Date: 2016-11-19
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
    <table>
        <tr><td>request = ${requestScope.req}</td></tr>
        <tr><td>session = ${sessionScope.ses}</td></tr>
        <tr><td>application = ${applicationScope.app}</td></tr>
    </table>
    <s:debug></s:debug>
</body>
</html>
