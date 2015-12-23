<%--
  Created by IntelliJ IDEA.
  User: ${USER}
  Date: ${DATE}
  Time: ${TIME}
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>#[[$Title$]]#</title>
</head>
<body>
<h4>Пользователь <% out.println(request.getAttribute("123"));%>успешно зарегестрирован!</h4>
</body>
</html>