<%--
  Created by IntelliJ IDEA.
  User: Zhoujp1
  Date: 2016-11-19
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
    <table bgcolor="#7fffd4" border="1">
        <tr><td>root中加载顺序</td></tr>
        <tr><td>Context中的 person = <s:property value="#person"></s:property> </td></tr>
        <tr><td>Root中的 person = <s:property value="person"></s:property> </td></tr>
        <tr><td>request中加载顺序</td></tr>
        <tr><td>request 中的 person = <s:property value="#request.person"></s:property></td><tr>
        <tr><td>#request = <s:property value="#request"></s:property></td></tr>
        <tr><td>session 中的 person = <s:property value="#session.person"></s:property></td><tr>
    </table>
    <s:debug></s:debug>
</body>
</html>
