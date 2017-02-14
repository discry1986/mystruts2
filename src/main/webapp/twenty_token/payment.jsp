<%--
  Created by IntelliJ IDEA.
  User: Zhoujp1
  Date: 2017-02-05
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>支付页面</title>
</head>
<body>
    <s:form method="POST" action="/mystruts2/twenty_token/paymentAction.php">
        <s:token/>
        <s:textfield label="付款金额" name="amount"></s:textfield>
        <s:submit value="确认支付"></s:submit>
    </s:form>
</body>
</html>
