<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Zhoujp1
  Date: 2017-02-03
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <h3>单文件上传</h3>
    <s:form action="/mystruts2/eighteen_fileupload/uploadAction.php" method="POST" enctype="multipart/form-data">
        <s:file label="上传文件" name="img"></s:file>
        <s:submit value="上传"></s:submit>
    </s:form>
    <h3>多文件上传</h3>
    <s:form action="/mystruts2/eighteen_fileupload/multiUploadAction.php" method="POST" enctype="multipart/form-data">
        <s:file label="上传文件" name="imgs"></s:file>
        <s:file label="上传文件" name="imgs"></s:file>
        <s:file label="上传文件" name="imgs"></s:file>
        <s:submit value="上传"></s:submit>
    </s:form>
</body>
</html>
