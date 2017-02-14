<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Zhoujp1
  Date: 2017-02-01
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title><s:text name="page.welcome.title"></s:text></title>
</head>
<body>
<a href="/mystruts2/seventeen_i18n/languageAction.php?request_locale=zh_CN">中文</a>
<a href="/mystruts2/seventeen_i18n/languageAction.php?request_locale=en_US">English</a>
<s:form action="/mystruts2/seventeen_i18n/loginAction_login.php" method="post">
    <s:textfield key="page.index.username" name="username"></s:textfield>
    <s:password key="page.index.password" name="password"></s:password>
    <s:submit key="page.index.submit"></s:submit>
</s:form>
</body>
</html>
