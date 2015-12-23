<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Юля
  Date: 18.12.2015
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Все пользователи</h3>
<c:forEach var="usr" items="${usrName}">
    <tr>
        <td width="160px"><c:out value="${usr}"/></td>

    </tr>
    <br>
</c:forEach>
</body>
</html>
