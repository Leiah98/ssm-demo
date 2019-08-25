<%--
  Created by IntelliJ IDEA.
  User: 许华
  Date: 2019/8/18
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试页面</title>
</head>
<body>
    <h3>3秒后跳转到meta_refresh.html页面，若没有跳转请点击<a href="index.html">这里</a></h3>
    <% response.setHeader("refresh", "3;URL=index.html"); %>
</body>
</html>
