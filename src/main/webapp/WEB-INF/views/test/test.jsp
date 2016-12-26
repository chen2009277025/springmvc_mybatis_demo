<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored ="false"
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<img src="/static/imgs/q.jpg" width="200" height="200">
<c:forEach var="item" items="${test}">
    <p>${item.id}:${item.name}</p>
</c:forEach>
</body>
</html>
