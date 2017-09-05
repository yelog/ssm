<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
        <th>id</th>
        <th>username</th>
        <th>password</th>
        <th>age</th>
        <th>used</th>
    </thead>
    <tbody>
    <c:forEach items="${command}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.username}</td>
            <td>${item.password}</td>
            <td>${item.age}</td>
            <td>${item.used}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
