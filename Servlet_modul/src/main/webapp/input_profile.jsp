<%--
  Created by IntelliJ IDEA.
  User: Юля
  Date: 18.12.2015
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Форма регистрации посетителей</title>
</head>
<body>
<h1>Регистрация посетителей</h1>

<form action="/servlet_Mod/Add" method="POST">
    Пользователь: <input type="text" name="user" size="10"><br>
    Пароль: <input type="password" name="password" size="10"><br>
    Email: <input type="text" name="email"><br>

    <table>
       <input type="submit" name="add" value="Сохранить">
    </table>
    <table>
        <input type="submit" name="cancel" value="Вывести всех пользователей">
    </table>
</form>
</body>
</html>
