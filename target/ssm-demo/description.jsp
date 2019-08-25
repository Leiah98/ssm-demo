<%--
  Created by IntelliJ IDEA.
  User: 许华
  Date: 2019/8/4
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ssm-demo</title>
</head>
<body>
<c:if test="${not empty description}">
    ${description.description}
</c:if>
<c:if test="${empty description}">
    数据为空，请检查数据！
</c:if>
</body>
</html>
