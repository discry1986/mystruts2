<%--
  Created by IntelliJ IDEA.
  User: Zhoujp1
  Date: 2017-02-01
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title><s:text name="page.welcom.title"></s:text></title>
</head>
<body>
    默认加载资源<br>
    <s:text name="page.welcome.msg">
        <s:param><s:property value="username"/></s:param>
    </s:text>
    <br>
    加载全局资源<br>
    <s:i18n name="mystruts2">
        <s:text name="page.welcome.msg">
            <s:param><s:property value="username"/></s:param>
        </s:text>
    </s:i18n>
    <br>
    加载package资源<br>
    <s:i18n name="com\discry\struts2\actions\package">
        <s:text name="page.welcome.msg">
            <s:param><s:property value="username"/></s:param>
        </s:text>
    </s:i18n>
    <br>
    加载Action资源<br>
    <s:i18n name="com\discry\struts2\actions\seventeen_i18n\LoginAction">
        <s:text name="page.welcome.msg">
            <s:param><s:property value="username"/></s:param>
        </s:text>
    </s:i18n>
</body>
</html>
