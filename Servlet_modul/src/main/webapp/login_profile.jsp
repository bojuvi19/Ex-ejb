<%@ page import="java.lang.ref.ReferenceQueue" %>
<%@ page import="java.util.List" %>
<%@ page import="crud.UserRow" %>
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
<%
    List<UserRow> list = (List<UserRow>) request.getAttribute("usrName");
%>
<table>
    <%
        for (UserRow userRow : list) {
    %>
    <tr><td><%=userRow.name%></td><td><%=userRow.email%></td></tr>
    <%
        }
    %>
</table>
</body>
</html>
